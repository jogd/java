import com.fasterxml.jackson.databind.ObjectMapper;

import javax.net.ssl.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Katerina on 9/4/15.
 */
public class PoiParser {

    private final String USER_AGENT = "Mozilla/5.0";
    private static final int PAGE_SIZE = 50;

    public static void main(String[] args) throws Exception {
        PoiParser parser  = new PoiParser();
        SiteObject rubricList = parser.getRubricList();
        System.out.println(rubricList);
        // get rubrics
        int rubricCount = 0;
        List<CategoryResultItem> resultItems = new ArrayList<CategoryResultItem>();
        for (Item item : rubricList.getResult().getItems()){
            for (Rubric rubric: item.getRubrics()){
//                System.out.println("Rubric name: "+rubric.getName()+" with id = "+rubric.getId());
                List<CategoryResultItem> rubricRequestResultItems = parser.getRubricItems(rubric, 1, PAGE_SIZE, null);
                resultItems.addAll(rubricRequestResultItems);
                rubricCount++;
            }
        }
        System.out.println("Total rubric amount = "+rubricCount);
        System.out.println("Total result items  = "+resultItems.size());
    }

    private SiteObject getRubricList() throws Exception {
        String url = "https://catalog.api.2gis.ru/2.0/catalog/rubric/list?parent_id=0&stat%5Bpr%5D=7&region_id=110&sort=popularity&fields=items.rubrics&key=rudcgu3317";
        String response = getResponceOnSsl(url);
        SiteObject rubricListResponce = parseRubricList(response);
        return  rubricListResponce;
    }

    public List<CategoryResultItem> getRubricItems(Rubric rubric, Integer pageNum, Integer pageSize, Integer totalItems) throws Exception {
        List<CategoryResultItem> rubricItems = new ArrayList<CategoryResultItem>();
        Thread.sleep(1000);
        String url = "https://catalog.api.2gis.ru/2.0/catalog/branch/list?page="+pageNum+"&page_size="+PAGE_SIZE+"&rubric_id=" + rubric.getId() + "&hash=hsydthivymii90qu&stat%5Bpr%5D=3&region_id=110&fields=items.adm_div%2Citems.contact_groups%2Citems.flags%2Citems.address%2Citems.rubrics%2Citems.name_ex%2Citems.point%2Citems.external_content%2Citems.org%2Cwidgets%2Cfilters%2Citems.reviews%2Ccontext_rubrics%2Crequest_type&key=rudcgu3317";
        String responce = getResponceOnSsl(url);
        System.out.println(responce);
        ObjectMapper mapper = new ObjectMapper();
        CategorySiteObject rubricResponce = mapper.readValue(responce, CategorySiteObject.class);
        if (totalItems == null){
            totalItems = Integer.parseInt(rubricResponce.getResult().getTotal());
        }
        rubricItems.addAll(rubricResponce.getResult().getItems());
        if (totalItems > pageSize){
            totalItems = totalItems - pageSize;
            pageNum++;
            rubricItems.addAll(getRubricItems(rubric, pageNum, pageSize, totalItems));
        }
        return rubricItems;
    }



    public SiteObject parseRubricList(String text) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        SiteObject parsedSite = mapper.readValue(text, SiteObject.class);
        return parsedSite;
    }



    public String getResponceOnSsl(String url) {
        // configure the SSLContext with a TrustManager
        SSLContext ctx = null;
        StringBuffer response = new StringBuffer();
        try {
            ctx = SSLContext.getInstance("TLS");
            ctx.init(new KeyManager[0], new TrustManager[] {new DefaultTrustManager()}, new SecureRandom());
            SSLContext.setDefault(ctx);


            URL obj = new URL(url);
            HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
            con.setHostnameVerifier(new HostnameVerifier() {
                @Override
                public boolean verify(String arg0, SSLSession arg1) {
                    return true;
                }
            });

            // optional default is GET
            con.setRequestMethod("GET");

            //add request header
            con.setRequestProperty("User-Agent", USER_AGENT);

            int responseCode = con.getResponseCode();
            System.out.println("\nSending 'GET' request to URL : " + url);
            System.out.println("Response Code : " + responseCode);

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

        } catch (Exception e) {
            System.out.println("BAD REQUEST to " + url);
            e.printStackTrace();
            return null;
        }


        //print result
//        System.out.println(response.toString());
        return  response.toString();


    }

    private static class DefaultTrustManager implements X509TrustManager {

        @Override
        public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {}

        @Override
        public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {}

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }
    }
}

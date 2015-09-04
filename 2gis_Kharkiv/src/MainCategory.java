import com.fasterxml.jackson.databind.ObjectMapper;

import javax.net.ssl.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;

/**
 * Created by Katerina on 8/25/15.
 */
public class MainCategory {
    private final String USER_AGENT = "Mozilla/5.0";

    public static void main(String[] args) throws Exception {
        MainCategory program = new MainCategory();
        String response = program.sendGet();
        SiteObject parcedSite = program.parseJson(response);
        program.getAllPoinds(parcedSite.getResult().getItems());
    }

    private String  sendGet() throws Exception {

        // configure the SSLContext with a TrustManager
        SSLContext ctx = SSLContext.getInstance("TLS");
        ctx.init(new KeyManager[0], new TrustManager[] {new DefaultTrustManager()}, new SecureRandom());
        SSLContext.setDefault(ctx);

        String url = "https://catalog.api.2gis.ru/2.0/catalog/rubric/list?parent_id=0&stat%5Bpr%5D=7&region_id=110&sort=popularity&fields=items.rubrics&key=rudcgu3317";

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
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();


        //print result
        System.out.println(response.toString());
        return  response.toString();

    }



    public SiteObject parseJson(String text) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        SiteObject parsedSite = mapper.readValue(text, SiteObject.class);
        return parsedSite;

    }

    public CategorySiteObject parseCategoryJson(String text) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        CategorySiteObject parsedSiteCategory = mapper.readValue(text, CategorySiteObject.class);
        return parsedSiteCategory;

    }


    private void   getAllPoinds(List<Item> items) throws Exception {

        // configure the SSLContext with a TrustManager
        SSLContext ctx = SSLContext.getInstance("TLS");
        ctx.init(new KeyManager[0], new TrustManager[] {new DefaultTrustManager()}, new SecureRandom());
        SSLContext.setDefault(ctx);

        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);


            String url = "https://catalog.api.2gis.ru/2.0/catalog/branch/list?page=" + !!! + "&page_size=50&rubric_id=" + item.getId() + "&hash=hsydthivymii90qu&stat%5Bpr%5D=3&region_id=110&fields=items.adm_div%2Citems.contact_groups%2Citems.flags%2Citems.address%2Citems.rubrics%2Citems.name_ex%2Citems.point%2Citems.external_content%2Citems.org%2Cwidgets%2Cfilters%2Citems.reviews%2Ccontext_rubrics%2Crequest_type&key=rudcgu3317";
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
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            CategorySiteObject SiteObjectCategory = parseCategoryJson(response.toString());

            //print result
            System.out.println(response.toString());



        }

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

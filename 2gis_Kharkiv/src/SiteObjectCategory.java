/**
 * Created by EkaterinaK on 26.08.2015.
 */
public class SiteObjectCategory {
    public SiteObjectCategory(){};
    Object meta;
    Result resultCategory;

    public Result getResult() {
        return resultCategory;
    }

    public void setResult(Result result) {
        this.resultCategory = result;
    }

    public Object getMeta() {

        return meta;
    }

    public void setMeta(Object meta) {
        this.meta = meta;
    }
}

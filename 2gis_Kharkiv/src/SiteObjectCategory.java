/**
 * Created by EkaterinaK on 26.08.2015.
 */
public class SiteObjectCategory {
    public SiteObjectCategory(){};

    public Object getMeta() {
        return meta;
    }

    public void setMeta(Object meta) {
        this.meta = meta;
    }

    public ResultCategory getResult() {
        return result;
    }

    public void setResult(ResultCategory result) {
        this.result = result;
    }

    Object meta;
    ResultCategory result;

}

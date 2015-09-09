package site.structure;

/**
 * Created by Katerina on 8/25/15.
 */
public class SiteObject {

    public SiteObject(){};

    public Object getMeta() {
        return meta;
    }

    public void setMeta(Object meta) {
        this.meta = meta;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    Object meta;
    Result result;

}

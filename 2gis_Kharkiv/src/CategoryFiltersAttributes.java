import java.util.List;

/**
 * Created by Katerina on 9/4/15.
 */
public class CategoryFiltersAttributes {
    public CategoryFiltersAttributes(){};

    String tag;
    String type;
    CategoryFiltersAttributesRange range;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CategoryFiltersAttributesRange getRange() {
        return range;
    }

    public void setRange(CategoryFiltersAttributesRange range) {
        this.range = range;
    }
}

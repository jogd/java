import java.util.List;

/**
 * Created by EkaterinaK on 04.09.2015.
 */
public class CategoryFilters {
    public CategoryFilters(){};
    List<CategoryFiltersAttributes> attributes;

    public List<CategoryFiltersAttributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<CategoryFiltersAttributes> attributes) {
        this.attributes = attributes;
    }
}

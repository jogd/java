package site.structure;

import java.util.List;

/**
 * Created by EkaterinaK on 04.09.2015.
 */
public class CategoryFilters {
    public CategoryFilters(){};
    List<CategoryFiltersAttributes> attributes;
    List<CategoryRubrics> rubrics;
    CategorySpatial spatial;

    public CategorySpatial getSpatial() {
        return spatial;
    }

    public void setSpatial(CategorySpatial spatial) {
        this.spatial = spatial;
    }

    public List<CategoryRubrics> getRubrics() {
        return rubrics;
    }

    public void setRubrics(List<CategoryRubrics> rubrics) {
        this.rubrics = rubrics;
    }

    public List<CategoryFiltersAttributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<CategoryFiltersAttributes> attributes) {
        this.attributes = attributes;
    }
}

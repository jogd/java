import java.util.List;

/**
 * Created by EkaterinaK on 26.08.2015.
 */
public class CategorySiteObject {
    public CategorySiteObject(){};


    Object meta;
    CategoryResult result;
    CategoryFilters filters;
    List<CategoryRubrics> rubrics;
    CategorySpatial spatial;
    List<CategoryDistricts> districts;
    String widgets;
    CategoryFood food;
    String details;
    String request_type;
    List<CategoryContextRubrics> context_rubrics;

    public Object getMeta() {
        return meta;
    }

    public void setMeta(Object meta) {
        this.meta = meta;
    }

    public CategoryResult getResult() {
        return result;
    }

    public void setResult(CategoryResult result) {
        this.result = result;
    }

    public CategoryFilters getFilters() {
        return filters;
    }

    public void setFilters(CategoryFilters filters) {
        this.filters = filters;
    }

    public List<CategoryRubrics> getRubrics() {
        return rubrics;
    }

    public void setRubrics(List<CategoryRubrics> rubrics) {
        this.rubrics = rubrics;
    }

    public CategorySpatial getSpatial() {
        return spatial;
    }

    public void setSpatial(CategorySpatial spatial) {
        this.spatial = spatial;
    }

    public List<CategoryDistricts> getDistricts() {
        return districts;
    }

    public void setDistricts(List<CategoryDistricts> districts) {
        this.districts = districts;
    }

    public String getWidgets() {
        return widgets;
    }

    public void setWidgets(String widgets) {
        this.widgets = widgets;
    }

    public CategoryFood getFood() {
        return food;
    }

    public void setFood(CategoryFood food) {
        this.food = food;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getRequest_type() {
        return request_type;
    }

    public void setRequest_type(String request_type) {
        this.request_type = request_type;
    }

    public List<CategoryContextRubrics> getContext_rubrics() {
        return context_rubrics;
    }

    public void setContext_rubrics(List<CategoryContextRubrics> context_rubrics) {
        this.context_rubrics = context_rubrics;
    }
}

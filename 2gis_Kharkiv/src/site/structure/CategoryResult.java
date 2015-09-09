package site.structure;

import java.util.List;

/**
 * Created by Katerina on 9/4/15.
 */
public class CategoryResult {
    public CategoryResult() {
    }

    String total;
    List<CategoryResultItem> items;

    CategoryFilters filters;
    CategoryWidgets widgets;
    String request_type;
    List<CategoryContextRubrics> context_rubrics;

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

    public CategoryWidgets getWidgets() {
        return widgets;
    }

    public void setWidgets(CategoryWidgets widgets) {
        this.widgets = widgets;
    }

    public CategoryFilters getFilters() {
        return filters;
    }

    public void setFilters(CategoryFilters filters) {
        this.filters = filters;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<CategoryResultItem> getItems() {
        return items;
    }

    public void setItems(List<CategoryResultItem> items) {
        this.items = items;
    }
}

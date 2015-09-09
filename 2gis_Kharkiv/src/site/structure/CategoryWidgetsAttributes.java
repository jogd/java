package site.structure;

import java.util.List;

/**
 * Created by Katerina on 9/4/15.
 */
public class CategoryWidgetsAttributes {
    public CategoryWidgetsAttributes(){}
    String group;
    CategoryWidgetsAttributesCategories categories;
    List<String> primary_attributes;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public CategoryWidgetsAttributesCategories getCategories() {
        return categories;
    }

    public void setCategories(CategoryWidgetsAttributesCategories categories) {
        this.categories = categories;
    }

    public List<String> getPrimary_attributes() {
        return primary_attributes;
    }

    public void setPrimary_attributes(List<String> primary_attributes) {
        this.primary_attributes = primary_attributes;
    }
}

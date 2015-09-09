package site.structure;

import java.util.List;

/**
 * Created by Katerina on 9/5/15.
 */
public class CategoryWidgetsAttributesCategoriesImportantItem {
    public CategoryWidgetsAttributesCategoriesImportantItem() {
    }
    String name;
    String type;
    String label;
    List<Boolean> values;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Boolean> getValues() {
        return values;
    }

    public void setValues(List<Boolean> values) {
        this.values = values;
    }
}

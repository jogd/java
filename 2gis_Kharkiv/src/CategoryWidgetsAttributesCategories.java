import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.corba.se.impl.ior.OldJIDLObjectKeyTemplate;

/**
 * Created by Katerina on 9/4/15.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryWidgetsAttributesCategories {
    public CategoryWidgetsAttributesCategories(){}

    CategoryWidgetsAttributesCategoriesImportant important;


    public CategoryWidgetsAttributesCategoriesImportant getImportant() {
        return important;
    }

    public void setImportant(CategoryWidgetsAttributesCategoriesImportant important) {
        this.important = important;
    }

}

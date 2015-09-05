import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by EkaterinaK on 04.09.2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryResultItemContactGroups {
    public CategoryResultItemContactGroups(){};

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    List<CategoryResultItemContactGroupsContacts> contacts;

    public List<CategoryResultItemContactGroupsContacts> getContacts() {
        return contacts;
    }

    public void setContacts(List<CategoryResultItemContactGroupsContacts> contacts) {
        this.contacts = contacts;
    }
}

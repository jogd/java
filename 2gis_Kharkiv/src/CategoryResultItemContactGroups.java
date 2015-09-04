import java.util.List;

/**
 * Created by EkaterinaK on 04.09.2015.
 */
public class CategoryResultItemContactGroups {
    public CategoryResultItemContactGroups(){};

    List<CategoryResultItemContactGroupsContacts> contacts;

    public List<CategoryResultItemContactGroupsContacts> getContacts() {
        return contacts;
    }

    public void setContacts(List<CategoryResultItemContactGroupsContacts> contacts) {
        this.contacts = contacts;
    }
}

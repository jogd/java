import java.util.List;

/**
 * Created by EkaterinaK on 04.09.2015.
 */
public class CategoryResultItemAddress {
    public CategoryResultItemAddress(){};
    String building_id;
    String building_name;
    String postcode;
    List<CategoryResultItemAddressComponents> components;
    String reg_bc_url;

    public String getBuilding_id() {
        return building_id;
    }

    public void setBuilding_id(String building_id) {
        this.building_id = building_id;
    }

    public String getBuilding_name() {
        return building_name;
    }

    public void setBuilding_name(String building_name) {
        this.building_name = building_name;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public List<CategoryResultItemAddressComponents> getComponents() {
        return components;
    }

    public void setComponents(List<CategoryResultItemAddressComponents> components) {
        this.components = components;
    }

    public String getReg_bc_url() {
        return reg_bc_url;
    }

    public void setReg_bc_url(String reg_bc_url) {
        this.reg_bc_url = reg_bc_url;
    }
}

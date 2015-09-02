/**
 * Created by EkaterinaK on 26.08.2015.
 */
public class MarkersCategoryItog {
    public MarkersCategoryItog(){};

    public String getBuilding_id() {
        return building_id;
    }

    public void setBuilding_id(String building_id) {
        this.building_id = building_id;
    }

    public String getBranch_id() {
        return branch_id;
    }

    public void setBranch_id(String branch_id) {
        this.branch_id = branch_id;
    }

    public String getOrg_id() {
        return org_id;
    }

    public void setOrg_id(String org_id) {
        this.org_id = org_id;
    }

    public String getIs_advertising() {
        return is_advertising;
    }

    public void setIs_advertising(String is_advertising) {
        this.is_advertising = is_advertising;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public List<NameExItog> getName_ex() {
        return name_ex;
    }

    public void setName_ex(List<NameExItog> name_ex) {
        this.name_ex = name_ex;
    }

    String building_id;
    String branch_id;
    String org_id;
    String is_advertising;
    String lon;
    String lat;

    List<NameExItog> name_ex;
}

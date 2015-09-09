package site.structure;

import java.util.List;

/**
 * Created by EkaterinaK on 04.09.2015.
 */
public class CategorySpatial {
    public CategorySpatial (){}
    List<CategorySpatialCities> cities;
    List<CategorySpatialDistrict> districts;

    public List<CategorySpatialDistrict> getDistricts() {
        return districts;
    }

    public void setDistricts(List<CategorySpatialDistrict> districts) {
        this.districts = districts;
    }

    public List<CategorySpatialCities> getCities() {
        return cities;
    }

    public void setCities(List<CategorySpatialCities> cities) {
        this.cities = cities;
    }
}

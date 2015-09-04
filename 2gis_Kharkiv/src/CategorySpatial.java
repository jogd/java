import java.util.List;

/**
 * Created by EkaterinaK on 04.09.2015.
 */
public class CategorySpatial {
    public CategorySpatial (){};
    List<CategorySpatialCities> cities;

    public List<CategorySpatialCities> getCities() {
        return cities;
    }

    public void setCities(List<CategorySpatialCities> cities) {
        this.cities = cities;
    }
}

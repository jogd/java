import java.util.List;

/**
 * Created by EkaterinaK on 04.09.2015.
 */
public class CategoryResultItemContext {
    public CategoryResultItemContext(){};
    List<CategoryResultItemContextFactors> stop_factors;

    public List<CategoryResultItemContextFactors> getStop_factors() {
        return stop_factors;
    }

    public void setStop_factors(List<CategoryResultItemContextFactors> stop_factors) {
        this.stop_factors = stop_factors;
    }
}

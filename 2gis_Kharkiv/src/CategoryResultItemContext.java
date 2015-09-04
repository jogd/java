import java.util.List;

/**
 * Created by EkaterinaK on 04.09.2015.
 */
public class CategoryResultItemContext {
    public CategoryResultItemContext(){};
    List<CategoryResultItemContextFactors> factors;

    public List<CategoryResultItemContextFactors> getFactors() {
        return factors;
    }

    public void setFactors(List<CategoryResultItemContextFactors> factors) {
        this.factors = factors;
    }
}

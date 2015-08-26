import java.util.List;

/**
 * Created by EkaterinaK on 26.08.2015.
 */
public class resultCategory {
    public resultCategory(){};

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    long total;
    List<Item> itemsCategory;
}

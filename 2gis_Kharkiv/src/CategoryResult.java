import java.util.List;

/**
 * Created by Katerina on 9/4/15.
 */
public class CategoryResult {
    public CategoryResult(){};
    String total;
    List<CategoryResultItem> items;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<CategoryResultItem> getItems() {
        return items;
    }

    public void setItems(List<CategoryResultItem> items) {
        this.items = items;
    }
}

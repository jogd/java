import java.util.List;

/**
 * Created by Katerina on 8/25/15.
 */
public class Result {

    public Result(){};

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    long total;
    List<Item> items;

}

import java.util.List;

/**
 * Created by Katerina on 8/25/15.
 */
public class Item {

    public Item (){};

    String id;
    String type;
    String name;
    String alias;
    String org_count;
    String branch_count;
    List<Rubric> rubrics;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getOrg_count() {
        return org_count;
    }

    public void setOrg_count(String org_count) {
        this.org_count = org_count;
    }

    public String getBranch_count() {
        return branch_count;
    }

    public void setBranch_count(String branch_count) {
        this.branch_count = branch_count;
    }

    public List<Rubric> getRubrics() {
        return rubrics;
    }

    public void setRubrics(List<Rubric> rubrics) {
        this.rubrics = rubrics;
    }
}

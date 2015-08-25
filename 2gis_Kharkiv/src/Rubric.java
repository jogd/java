/**
 * Created by Katerina on 8/25/15.
 */
public class Rubric {

    public Rubric(){};

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

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
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

    String id;
    String type;
    String name;
    String alias;
    String parent_id;
    String org_count;
    String branch_count;

}

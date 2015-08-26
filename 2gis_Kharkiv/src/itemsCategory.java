/**
 * Created by EkaterinaK on 26.08.2015.
 */
public class itemsCategory {
    public itemsCategory(){}
    String id;
    String type;
    String name;
    String alias;
    String parant_id;
    String org_count;
    String branch_count;

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

    public String getParant_id() {
        return parant_id;
    }

    public void setParant_id(String parant_id) {
        this.parant_id = parant_id;
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
}

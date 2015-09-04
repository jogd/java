import java.util.List;

/**
 * Created by Katerina on 9/4/15.
 */
public class CategoryResultItem {
    String id;
    String type;
    String name;
    List<CategoryResultItemNameEx> name_ex;
    List<CategoryResultItemPoint> point;
    List<CategoryResultItemAdmDiv> adm_div;
    List<CategoryResultItemAddress> address;
    String address_name;
    CategoryResultItemOrg org;
    CategoryResultItemContactGroups contact_groups;
    List<CategoryResultItemRubrics> rubrics;
    CategoryResultItemReviews reviews;
    CategoryResultItemAds ads;
    CategoryResultItemFlags flags;
    List<CategoryResultItemExternalContent> external_content;
    CategoryResultItemContext context;
    CategoryResultItemAddressComponents address_comment;

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

    public List<CategoryResultItemNameEx> getName_ex() {
        return name_ex;
    }

    public void setName_ex(List<CategoryResultItemNameEx> name_ex) {
        this.name_ex = name_ex;
    }

    public List<CategoryResultItemPoint> getPoint() {
        return point;
    }

    public void setPoint(List<CategoryResultItemPoint> point) {
        this.point = point;
    }

    public List<CategoryResultItemAdmDiv> getAdm_div() {
        return adm_div;
    }

    public void setAdm_div(List<CategoryResultItemAdmDiv> adm_div) {
        this.adm_div = adm_div;
    }

    public List<CategoryResultItemAddress> getAddress() {
        return address;
    }

    public void setAddress(List<CategoryResultItemAddress> address) {
        this.address = address;
    }

    public String getAddress_name() {
        return address_name;
    }

    public void setAddress_name(String address_name) {
        this.address_name = address_name;
    }

    public CategoryResultItemOrg getOrg() {
        return org;
    }

    public void setOrg(CategoryResultItemOrg org) {
        this.org = org;
    }

    public CategoryResultItemContactGroups getContact_groups() {
        return contact_groups;
    }

    public void setContact_groups(CategoryResultItemContactGroups contact_groups) {
        this.contact_groups = contact_groups;
    }

    public List<CategoryResultItemRubrics> getRubrics() {
        return rubrics;
    }

    public void setRubrics(List<CategoryResultItemRubrics> rubrics) {
        this.rubrics = rubrics;
    }

    public CategoryResultItemReviews getReviews() {
        return reviews;
    }

    public void setReviews(CategoryResultItemReviews reviews) {
        this.reviews = reviews;
    }

    public CategoryResultItemAds getAds() {
        return ads;
    }

    public void setAds(CategoryResultItemAds ads) {
        this.ads = ads;
    }

    public CategoryResultItemFlags getFlags() {
        return flags;
    }

    public void setFlags(CategoryResultItemFlags flags) {
        this.flags = flags;
    }

    public List<CategoryResultItemExternalContent> getExternal_content() {
        return external_content;
    }

    public void setExternal_content(List<CategoryResultItemExternalContent> external_content) {
        this.external_content = external_content;
    }

    public CategoryResultItemContext getContext() {
        return context;
    }

    public void setContext(CategoryResultItemContext context) {
        this.context = context;
    }

    public CategoryResultItemAddressComponents getAddress_comment() {
        return address_comment;
    }

    public void setAddress_comment(CategoryResultItemAddressComponents address_comment) {
        this.address_comment = address_comment;
    }
}

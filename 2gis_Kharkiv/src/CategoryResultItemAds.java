import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by EkaterinaK on 04.09.2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryResultItemAds {
    public CategoryResultItemAds(){};

    String text;
    String article;
    CategoryResultItemAdsLink link;

    public CategoryResultItemAdsLink getLink() {
        return link;
    }

    public void setLink(CategoryResultItemAdsLink link) {
        this.link = link;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }
}

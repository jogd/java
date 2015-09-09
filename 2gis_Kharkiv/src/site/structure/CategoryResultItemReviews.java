package site.structure;

import java.util.List;

/**
 * Created by EkaterinaK on 04.09.2015.
 */
public class CategoryResultItemReviews {
    public CategoryResultItemReviews(){};

    String is_reviewable;
    String is_reviewable_on_flamp;
    String general_rating;
    String general_review_count;
    List<CategoryResultItemReviewsItems> items;
    String reg_bc_url;

    public String getIs_reviewable() {
        return is_reviewable;
    }

    public void setIs_reviewable(String is_reviewable) {
        this.is_reviewable = is_reviewable;
    }

    public String getIs_reviewable_on_flamp() {
        return is_reviewable_on_flamp;
    }

    public void setIs_reviewable_on_flamp(String is_reviewable_on_flamp) {
        this.is_reviewable_on_flamp = is_reviewable_on_flamp;
    }

    public String getGeneral_rating() {
        return general_rating;
    }

    public void setGeneral_rating(String general_rating) {
        this.general_rating = general_rating;
    }

    public String getGeneral_review_count() {
        return general_review_count;
    }

    public void setGeneral_review_count(String general_review_count) {
        this.general_review_count = general_review_count;
    }

    public List<CategoryResultItemReviewsItems> getItems() {
        return items;
    }

    public void setItems(List<CategoryResultItemReviewsItems> items) {
        this.items = items;
    }

    public String getReg_bc_url() {
        return reg_bc_url;
    }

    public void setReg_bc_url(String reg_bc_url) {
        this.reg_bc_url = reg_bc_url;
    }
}

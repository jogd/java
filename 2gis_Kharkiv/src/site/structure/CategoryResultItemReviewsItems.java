package site.structure;

/**
 * Created by EkaterinaK on 04.09.2015.
 */
public class CategoryResultItemReviewsItems {
    public CategoryResultItemReviewsItems(){};

    String tag;
    String is_reviewable;
    String rating;
    String review_count;
    String recommendation_count;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getIs_reviewable() {
        return is_reviewable;
    }

    public void setIs_reviewable(String is_reviewable) {
        this.is_reviewable = is_reviewable;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getReview_count() {
        return review_count;
    }

    public void setReview_count(String review_count) {
        this.review_count = review_count;
    }

    public String getRecommendation_count() {
        return recommendation_count;
    }

    public void setRecommendation_count(String recommendation_count) {
        this.recommendation_count = recommendation_count;
    }
}

package inheritance.RestaurantReviews;

import java.util.ArrayList;
import java.util.List;

public class Shop extends Establishment {
    private int priceCategory;
    private List<Review> reviews;
    private String description;

    public Shop(String name, double stars, int priceCategory, String description) {
        super(name, stars, priceCategory);
        this.priceCategory = priceCategory;
        this.description = description;
        this.reviews = new ArrayList<>();
    }

    public void addReview(Review review) {
        if (!reviews.contains(review)) {
            reviews.add(review);
            recalculateStarValue();
        }
    }

    public void recalculateStarValue() {
        double totalStars = 0;
        for (Review review : reviews) {
            totalStars += review.getNumOfStars();
        }
        setStars(reviews.isEmpty() ? 0 : (totalStars / reviews.size()));
    }

    public int getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(int priceCategory) {
        this.priceCategory = priceCategory;
    }

    @Override
    public List<Review> getReviews() {
        return reviews;
    }

    @Override
    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + getName() + '\'' +
                ", stars=" + getStars() +
                ", description=" + description +
                ", priceCategory=" + priceCategory +
                ", reviews=" + reviews +
                '}';
    }
}

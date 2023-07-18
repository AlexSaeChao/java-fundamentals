package inheritance.RestaurantReviews;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private double stars;
    private int priceCategory;
    private List<Review> reviews;

    public Restaurant(String name, double stars, int priceCategory) {
        this.name = name;
        this.stars = stars;
        this.priceCategory = priceCategory;
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
        stars = reviews.isEmpty() ? 0 : (totalStars / reviews.size());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(int priceCategory) {
        this.priceCategory = priceCategory;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", priceCategory=" + priceCategory +
                ", reviews=" + reviews +
                '}';
    }
}
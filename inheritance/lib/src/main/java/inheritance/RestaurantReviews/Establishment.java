package inheritance.RestaurantReviews;

import java.util.List;

public class Establishment {
    private String name;
    public double stars;

    private int priceCategory;
    private List<Review> reviews;

    public Establishment(String name, double stars, int priceCategory) {
        this.name = name;
        this.stars = stars;
        this.priceCategory = priceCategory;
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

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public String getName() {
        return name;
    }

    public double getStars() {
        return stars;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "Establishment{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", priceCategory=" + priceCategory +
                ", reviews=" + reviews +
                '}';
    }
}

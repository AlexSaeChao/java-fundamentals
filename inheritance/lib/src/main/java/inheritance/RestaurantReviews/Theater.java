package inheritance.RestaurantReviews;

import java.util.ArrayList;
import java.util.List;

public class Theater extends Establishment {
    private int priceCategory;
    private List<Review> reviews;
    public List<Movie> movies;

    public Theater(String name, double stars, int priceCategory) {
        super(name, stars, priceCategory);
        this.priceCategory = priceCategory;
        this.reviews = new ArrayList<>();
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> getMovies() {
        return movies;
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
        return "Shop{" +
                "name='" + getName() + '\'' +
                ", stars=" + getStars() +
                ", priceCategory=" + priceCategory +
                ", movies=" + movies +
                ", reviews=" + reviews +
                '}';
    }
}

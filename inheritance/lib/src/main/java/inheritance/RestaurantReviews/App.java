package inheritance.RestaurantReviews;

public class App {

public static void main(String[] args) {
    // Create a Restaurant
    Restaurant restaurant = new Restaurant("Yum Yum Bowls", 0, 2);

    // Create Reviews
    Review review1 = new Review("Great food and service!", "Green G.", 5);
    restaurant.addReview(review1);
    Review review2 = new Review("Average experience.", "M.Jane", 2);
    restaurant.addReview(review2);

    // Review with the restaurant
    System.out.println("Reviews for " + restaurant.getName() + ":");
    for (Review review : restaurant.getReviews()) {
        System.out.println(review.toString());
    }

    // Add another review and check the updated star rating
    Review review3 = new Review("Not my vibe", "Peter Porker", 1);
    restaurant.addReview(review3);
    System.out.println(review3);
    System.out.println("Updated star rating: " + restaurant.getStars());
}
}

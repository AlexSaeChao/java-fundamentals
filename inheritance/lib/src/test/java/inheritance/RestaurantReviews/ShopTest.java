/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance.RestaurantReviews;

import org.junit.jupiter.api.Test;

class ShopTest {
    @Test void testRestaurantCreation() {

        Shop baitShop = new Shop("Bait Shop", 0, 2, "Shop that sells bait!");

        // Act
        Review review1 = new Review("Lots of things to look through", "Gina B.", 5);
        baitShop.addReview(review1);

        Review review2 = new Review("Clean place for a bait shop.", "Tholin Johnson", 4);
        baitShop.addReview(review2);

        // Assert
        System.out.println("Reviews for " + baitShop.getName() + ": Description: " + baitShop.description + "\nReviews: ");
        for (Review review : baitShop.getReviews()) {
            System.out.println(review.toString());
        }

        Review review3 = new Review("Saw my cousin on the wall.", "fish", 1);
        baitShop.addReview(review3);
        System.out.println(review3);
        System.out.println("Updated star rating: " + baitShop.getStars());
    }
}

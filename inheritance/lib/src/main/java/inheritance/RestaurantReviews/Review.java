package inheritance.RestaurantReviews;

public class Review {
    private String body;
    private String author;
    private double numOfStars;

    public Review(String body, String author, double numOfStars) {
        this.body = body;
        this.author = author;
        this.numOfStars = numOfStars;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getNumOfStars() {
        return numOfStars;
    }

    public void setNumOfStars(double numOfStars) {
        this.numOfStars = numOfStars;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", numOfStars=" + numOfStars +
                '}';
    }
}

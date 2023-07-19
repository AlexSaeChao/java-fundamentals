package inheritance.RestaurantReviews;

public class Movie {
    private String name;
    private String director;


    public Movie(String name, String director) {
        this.name = name;
        this.director = director;

    }

    public String getBody() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setBody(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return director;
    }

    public void setAuthor(String director) {
        this.director = director;
    }



    @Override
    public String toString() {
        return "Movies{" +
                "name='" + name + '\'' +
                ", author='" + director + '\'' +
                '}';
    }
}

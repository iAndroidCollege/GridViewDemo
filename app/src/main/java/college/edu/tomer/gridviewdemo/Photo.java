package college.edu.tomer.gridviewdemo;

public class Photo {

    public Photo(String url, Float rating) {
        this.url = url;
        this.rating = rating;
    }

    private String url;
    private Float rating;

    public String getUrl() {
        return url;
    }

    public Float getRating() {
        return rating;
    }
}

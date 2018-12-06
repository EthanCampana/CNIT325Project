
import java.io.Serializable;
import java.util.ArrayList;


public class Restaurant implements Serializable {

    private String id;
    private String alias;
    private String name;
    private String image_url;
    private boolean is_claimed;
    private boolean is_closed;
    private String url;
    private String price;
    private float rating;
    private float review_count;
    private String phone;
    Object[] photos;
    Object[] hours;
    Object[] categories;
    Coordinates coordinates;
    Location location;
    Object[] transactions;
    private ArrayList<Review> reviews;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public boolean isIs_claimed() {
        return is_claimed;
    }

    public void setIs_claimed(boolean is_claimed) {
        this.is_claimed = is_claimed;
    }

    public boolean isIs_closed() {
        return is_closed;
    }

    public void setIs_closed(boolean is_closed) {
        this.is_closed = is_closed;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public float getReview_count() {
        return review_count;
    }

    public void setReview_count(float review_count) {
        this.review_count = review_count;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Object[] getPhotos() {
        return photos;
    }

    public void setPhotos(Object[] photos) {
        this.photos = photos;
    }

    public Object[] getHours() {
        return hours;
    }

    public void setHours(Object[] hours) {
        this.hours = hours;
    }

    public Object[] getCategories() {
        return categories;
    }

    public void setCategories(Object[] categories) {
        this.categories = categories;
    }

    public Coordinates getCoordinatesObject() {
        return coordinates;
    }

    public void setCoordinatesObject(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Location getLocationObject() {
        return location;
    }

    public void setLocationObject(Location location) {
        this.location = location;
    }

    public Object[] getTransactions() {
        return transactions;
    }

    public void setTransactions(Object[] transactions) {
        this.transactions = transactions;
    }

    public void addReview(Review r){
    reviews.add(r);
    
    }

}

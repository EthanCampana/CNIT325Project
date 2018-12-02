
public class Review {
    private int ratingscore;
    private String reviewDescription;

    public Review(int ratingscore) {
        this.ratingscore = ratingscore;
    }

    public Review(String reviewDescription) {
        this.reviewDescription = reviewDescription;
    }

    public int getRatingscore() {
        return ratingscore;
    }

    public void setRatingscore(int ratingscore) {
        this.ratingscore = ratingscore;
    }

    public String getReviewDescription() {
        return reviewDescription;
    }

    public void setReviewDescription(String reviewDescription) {
        this.reviewDescription = reviewDescription;
    }
               
    
}

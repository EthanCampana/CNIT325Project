
public class User extends Person implements LeaveReview {

    public String UserName;

    public User(String UserName, String Password, String FirstName, String LastName) {
        this.UserName = UserName;
        this.Password = Password;
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    public String Password;

    @Override
    public Review LeaveReview() {
        RatingDialog rating = new RatingDialog();
        boolean ready = false;
        Review myreview = new Review(rating.ReturnValue());
        while (!ready) {
            if (myreview.getRatingscore() >= 0) {
                myreview = new Review(rating.ReturnValue());
                rating.dispose();
                return myreview;
            }
        }
        return null;
    }
}

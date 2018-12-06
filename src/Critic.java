
import java.util.ArrayList;


public class Critic extends Person implements LeaveReview
{
    
    private String UserName;
    private String Password;
    private ArrayList<Review> reviews;

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
    public void addReview(Review e){
    reviews.add(e);
    }

    public Critic(String UserName, String Password, String Firstname, String Lastname) {
        this.FirstName =Firstname;
        this.LastName = Lastname;
        this.UserName = UserName;
        this.Password = Password;
    }
    
    
    
    @Override
    public Review LeaveReview(){
    CriticDialog dialog = new CriticDialog();
    Review myreview = new Review(dialog.ReturnValue());
        addReview(myreview);
        return myreview;
    }
}

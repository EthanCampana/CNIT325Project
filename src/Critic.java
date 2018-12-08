
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Critic extends Person implements LeaveReview {

    private String UserName;
    private String Password;
    private ArrayList<Review> reviews = new ArrayList<>();

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

    public void addReview(Review e) {
        reviews.add(e);
    }

    public Critic(String UserName, String Password, String Firstname, String Lastname) {
        this.FirstName = Firstname;
        this.LastName = Lastname;
        this.UserName = UserName;
        this.Password = Password;
    }

    @Override
    public Review LeaveReview() {
        CriticDialog dialog = new CriticDialog();
        boolean ready = false;
        Review myreview = new Review(dialog.ReturnValue());
        while (!ready) {
            myreview.setReviewDescription(dialog.ReturnValue());
            System.out.print("");
            if (!myreview.getReviewDescription().equals("")) {
                dialog.dispose();
                System.out.println("Enter");
                addReview(myreview);              
                return myreview;
            }
        }
        dialog.dispose();
        return null;
    }
}

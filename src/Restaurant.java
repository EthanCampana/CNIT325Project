
import java.util.ArrayList;


public class Restaurant extends Information {
    private ArrayList<String> RestType;
    private Address Address = new Address("","","","");

    public Restaurant(String Name,String Description ,ArrayList<String> RestType, Address Address) {
        this.Name = Name;
        this.Description = Description;
        this.RestType = RestType;
        this.Address = Address;
    }
    public void AddResturauntType(String s){
        RestType.add(s);
    }
    public String GetResturauntType(){
    String out = String.join(",", RestType);
    return out;
    }
    
    
    
}

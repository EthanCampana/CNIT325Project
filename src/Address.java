
public class Address extends Contact {

    public Address(String Zipcode, String Street, String State) {
        this.Zipcode = Zipcode;
        this.Street = Street;
        this.State = State;
    }
    
    public Address(String Zipcode, String Street, String State, String PhoneNumber){
        this.Zipcode = Zipcode;
        this.Street = Street;
        this.State = State;
        this.PhoneNumber = PhoneNumber;
    }
    
    private String Zipcode;

    public String getZipcode() {
        return Zipcode;
    }

    public void setZipcode(String Zipcode) {
        this.Zipcode = Zipcode;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }
    private String Street;
    private String State;
    
}

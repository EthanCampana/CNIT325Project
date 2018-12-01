
public class Feed {
    
    private int total;
    private Restaurant[] businesses;

    public Feed(int total, Restaurant[] businesses) {
        this.total = total;
        this.businesses = businesses;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Restaurant[] getBusinesses() {
        return businesses;
    }

    public void setBusinesses(Restaurant[] businesses) {
        this.businesses = businesses;
    }
    
    
    
}

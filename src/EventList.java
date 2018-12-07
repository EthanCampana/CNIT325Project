
import java.io.Serializable;


/**
 *
 * @author cdw20
 */
public class EventList implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private int total_items, page_size, page_count, page_number, page_item;
    private double search_time;
    private Event[] events;

    public int getTotal_items() {
        return total_items;
    }

    public void setTotal_items(int total_items) {
        this.total_items = total_items;
    }

    public Event[] getEvents() {
        return events;
    }

    public void setEvents(Event[] events) {
        this.events = events;
    }
    
    
    
}

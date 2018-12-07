
import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
 

@XmlRootElement(name = "event")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Event implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private Location location;
//    private Time StartTime = new Time();
//    private Time EndTime = new Time();
    private String title;
    private String start_time;
    private String end_time;
    private boolean AllDay;
    private String description;

    
    
    
    public Event(String title, String description, String start_time, String end_time, Location location) {
        super();
        this.title = title;
        this.description = description;
        this.start_time = start_time;
        this.end_time = end_time;
        this.location = location;
    }
    


//    public void ParseStartTime(String Time) throws ParseException{
//       Date newStartTime = StartTime.ReturnParseDate(Time);
//       StartTime.setMyDate(newStartTime);
//    }
//    public void ParseEndTime(String Time) throws ParseException{
//       Date newEndTime = StartTime.ReturnParseDate(Time);
//       EndTime.setMyDate(newEndTime);
//    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public boolean isAllDay() {
        return AllDay;
    }

    public void setAllDay(boolean AllDay) {
        this.AllDay = AllDay;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    
}

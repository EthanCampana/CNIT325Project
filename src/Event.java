
import java.text.ParseException;
import java.util.Date;


public class Event extends Information {
    
    private Address Address = new Address("","","","");
    private Time StartTime = new Time();
    private Time EndTime = new Time();
    private boolean AllDay = false;
    
    public Event(){
    }
    
    
    
    public void setStartTime(Time StartTime) {
        this.StartTime = StartTime;
    }

    public void setEndTime(Time EndTime) {
        this.EndTime = EndTime;
    }

    public void setAllDay(boolean AllDay) {
        this.AllDay = AllDay;
    }

    public void ParseStartTime(String Time) throws ParseException{
       Date newStartTime = StartTime.ReturnParseDate(Time);
       StartTime.setMyDate(newStartTime);
    }
    public void ParseEndTime(String Time) throws ParseException{
       Date newEndTime = StartTime.ReturnParseDate(Time);
       EndTime.setMyDate(newEndTime);
    }

    public Date getStartTime() {
        return StartTime.getMyDate();
    }

    public Date getEndTime() {
        return EndTime.getMyDate();
    }

    public boolean isAllDay() {
        return AllDay;
    }
    
    
}


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Time {
protected Date myDate = new Date();
SimpleDateFormat format = new SimpleDateFormat("EEEE, MMM dd, yyyy HH:mm:ss a");

    public Time() {
    }
    public Time(Date date){
    this.myDate = date;
    }
    public Date getMyDate() {
        return myDate;
    }
    public void setMyDate(Date myDate) {
        this.myDate = myDate;
    }
    public void ParseDate(String Date){
    try {
        Date date = format.parse(Date);
        this.myDate = date;
        
    } catch (ParseException ex) {
        Logger.getLogger(Time.class.getName()).log(Level.SEVERE, null, ex);
    }
    
   
    }
    public Date ReturnParseDate(String Date) throws ParseException{
     Date date = format.parse(Date);
    
     return date;
    }
 




}

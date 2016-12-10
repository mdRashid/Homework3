package myApi;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class UseCalendar {

	public static void CalendarClass() {
        System.out.println("Calendar Class example:\n");
        
        Calendar calendar = new GregorianCalendar(2016,4,10,7,20,22);
 
        int year       = calendar.get(Calendar.YEAR);
        int month      = calendar.get(Calendar.MONTH);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        int weekOfMonth= calendar.get(Calendar.WEEK_OF_MONTH);
  
 
        System.out.println("year \t\t: " + year);
        System.out.println("month \t\t: " + month);
        System.out.println("dayOfMonth \t: " + dayOfMonth);
        System.out.println("dayOfWeek \t: " + dayOfWeek);
        System.out.println("weekOfYear \t: " + weekOfYear);
        System.out.println("weekOfMonth \t: " + weekOfMonth);
 
        System.out.println("\n");
    }
	
        public static void main(String[] args) {
		
        	CalendarClass();

	}
}

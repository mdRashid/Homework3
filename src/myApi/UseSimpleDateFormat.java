package myApi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class UseSimpleDateFormat {

	public static void main(String[] args) {

		SimpleDateFormatClass();
        
        
        System.out.println("Calendar Class example:\n");
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
 
        Calendar calendar = new GregorianCalendar(2016,8,24,12,15,22);
        System.out.println("#1. " + sdf.format(calendar.getTime()));
 
        System.out.println("\n");
		

	}

	private static void SimpleDateFormatClass() {
		
		
	}

}

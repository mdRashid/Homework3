package myApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseCollections {

	private static void CollectionsClass() {
        System.out.println("Collections Class example:\n");
        List<String> myList = new ArrayList<String>();
        myList.add("SDLC");
        myList.add("ALM");
        myList.add("SQL");
        System.out.println("Initial list:"+myList);
         
         
        Collections.addAll(myList, "Selenium","QTP");
         
         
        System.out.println("After adding elements:"+myList);
         
        String[] strArr = {"Developer", "DBA"};
         
        Collections.addAll(myList, strArr);
         
        System.out.println("After adding array:"+myList);
        System.out.println("\n");
    }
	
        public static void main(String[] args) {
		
        	CollectionsClass();

	}
}

package myApi;

import java.util.ArrayList;
import java.util.List;

public class UseList {

	private static void ListClass() {
        System.out.println("List Class example:\n");
        List<String> myList = new ArrayList<String>();
        myList.add("SDLC");
        myList.add("ALM");
        myList.add("SQL");
        System.out.println("Initial list:"+myList);
        System.out.println("\n");
    }
	
    public static void main(String[] args) {
		
    	ListClass();

	}
}

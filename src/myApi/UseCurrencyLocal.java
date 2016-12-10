package myApi;

import java.util.Currency;
import java.util.Locale;

public class UseCurrencyLocal {

	private static void CurrencyLocalClass() {
        System.out.println("Currency, Local Class example:\n");
         
 
  
        Currency curr = Currency.getInstance(Locale.JAPAN);
         
        System.out.println("The currency of Japan is " + curr.getCurrencyCode());
        System.out.println("The getDisplayName of Japan is " + curr.getDisplayName());
  
        System.out.println("\n");
    }
	
    public static void main(String[] args) {
		
	   CurrencyLocalClass();

	}
}

package myApi;

import java.util.Scanner;

public class UseScanner {

	public static void main(String[] args) {
		
        int [] array = new int [5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter input values: ");
		for(int j=0; j<array.length; j++){
		 array[j] = sc.nextInt();
		}
		System.out.println("Let's retrieve the values from the array......");
		for(int i = 0; i<array.length; i++){
		   System.out.println(array[i]);
		}

	}

}

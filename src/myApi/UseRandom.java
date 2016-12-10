package myApi;

import java.util.Random;

public class UseRandom {

	public static void main(String[] args) {
		
		int [] array = new int [20];
		Random random = new Random();
		for(int i=0; i<array.length; i++){
		      array[i] = random.nextInt(100);
		}
		
		for(int i=0; i<array.length; i++){
		      System.out.println(array[i]);
		}

	}

}

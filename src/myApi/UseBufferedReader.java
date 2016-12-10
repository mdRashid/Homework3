package myApi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UseBufferedReader {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		String path = "C:/Users/Zahid/Documents/Selenium/myFile1.txt";
		
		try {
			fr = new FileReader(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("please fix the path");
		}
		br = new BufferedReader(fr);
		String text = "";
		try {
			while((text = br.readLine())!=null){
				System.out.println(text);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			
			try{
				
			if(br != null){   
				br = null;    
			}if(fr != null){  
				fr = null;    
			}
			}catch(Exception ex){
				ex.printStackTrace();
			}
	    }

			
					
	}

}

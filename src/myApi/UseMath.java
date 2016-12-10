package myApi;

public class UseMath {

	private static void MathClass() {
        
        double adouble  = 4.5;
        System.out.println("Math Class method  ceil,floor and round\n");
        
        System.out.println("Maths.ceil(4.5): "+Math.ceil(adouble));
         
        System.out.println("Maths.floor(4.5): "+Math.floor(adouble));
         
        System.out.println("Maths.round(4.5): "+Math.round(adouble));
         
        System.out.println("\n");
    }
	
    public static void main(String[] args) {
		
	       MathClass();
	       
	    int num =10;
		do{
		   System.out.println(num);
		}while(num<0);

	}
}

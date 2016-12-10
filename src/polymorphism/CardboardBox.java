package polymorphism;

public class CardboardBox {
	
	public final int areaOfSpace(int a, int b, int c, int d){
		int total = a + b + c + d;
		
		return total;
	}
	public int areaOfSpace(int a, int b, int c, int d, int e){
		int total = a + b + c + d + e;
		
		return total;
	}

}

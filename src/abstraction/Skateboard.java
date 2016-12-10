package abstraction;

public class Skateboard extends Scooter {
	
    public void twoWheels(){
    	System.out.println("scooter has two wheels");
    }
	
	public final void oneHandleBar(){
		System.out.println("scooter has one handle bar");
	}
	
	
	
	public final void fourWheels(){
		System.out.println("skateboard has four wheels");
	}
	
	public void gripTape(){
		System.out.println("skateboard has grip tape");
	}
	
	public final static int numberOfTrucks = 2;
	
	public static int numberOfBearings = 8;
	
	
	
	
	public int size = 10;
	public String skateboardBrand = "Element";
	
	public Skateboard(){
	}
	
	public Skateboard(String skateboardBrand){
		this.skateboardBrand = skateboardBrand;
	}
	
	
	
	public void setSkateboardBrandName(String skateboardBrand){
		this.skateboardBrand = skateboardBrand;
	}
	
	

}






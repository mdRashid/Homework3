package abstraction;

public abstract class Scooter implements Bicycle {
	
    public final void twoPedals(){
    	System.out.println("bicycle has two pedals");
    }
	
	public void oneSeat(){
		System.out.println("bicycle has one seat");
	}
	
	public abstract void twoWheels();
	
	public abstract void oneHandleBar();

}

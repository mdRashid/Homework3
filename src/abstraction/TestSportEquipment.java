package abstraction;

public class TestSportEquipment {

	public static void main(String[] args) {
		
		Bicycle bicycle = new Skateboard();
		bicycle.twoPedals();
		bicycle.oneSeat();
		
		
		Scooter scooter = new Skateboard();
		scooter.twoWheels();
		scooter.oneHandleBar();
		
		
		Skateboard skateboard = new Skateboard();
		skateboard.fourWheels();
		skateboard.gripTape();
		System.out.println("skateboard's total number of trucks is: " + skateboard.numberOfTrucks);
		System.out.println("skateboard's total number of bearings is: " + skateboard.numberOfBearings);
		
		System.out.println("my skateboard's brand name is: " + skateboard.skateboardBrand);

	}

}

package polymorphism;

public class TestCardboardBox {

	public static void main(String[] args) {
		
		CardboardBox cardboardBox = new CardboardBox();
		int squareSize = cardboardBox.areaOfSpace(20, 25, 30, 35);
        System.out.println(squareSize);
        int pentagonSize = cardboardBox.areaOfSpace(20, 25, 30, 35, 15);
        System.out.println(pentagonSize);
        
        CardboardBox superCardboardBox = new SuperCardboardBox();
		int superpentagonSize = superCardboardBox.areaOfSpace(20, 25, 30, 35, 15);
        System.out.println(superpentagonSize);

	}

}

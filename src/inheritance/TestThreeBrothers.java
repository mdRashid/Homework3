package inheritance;

public class TestThreeBrothers {

	public static void main(String[] args) {
		
		OldestBrother ob = new OldestBrother();
		ob.construction();
		System.out.println("oldest brother's height is " + ob.height);
		System.out.println("oldest brother is a " + ob.skills);
		
		MiddleBrother mb = new MiddleBrother();
		mb.brownEyes();
		mb.construction();
		
		YoungestBrother yb = new YoungestBrother();
		yb.hobby();
		yb.construction();
		yb.brownEyes();
		

	}

}

package encapsulation;

public class TestTeacherDatabase {

	public static void main(String[] args) {
		
		Teacher teacher1 = new Teacher();
		teacher1.setTeacherID(7);
		teacher1.setTeacherName("Smith");
		teacher1.setTeacherSSN("678-90-1234");
		teacher1.setTeacherDOB("5-1-1980");
		
		System.out.println(teacher1.getTeacherID() + " " + teacher1.getTeacherName() + " " + teacher1.getTeacherSSN() + " " + teacher1.getTeacherDOB());
		
		Teacher teacher2 = new Teacher();
		teacher2.setTeacherID(9);
		teacher2.setTeacherName("Wesley");
		teacher2.setTeacherSSN("334-10-5345");
		teacher2.setTeacherDOB("6-22-1981");
		
		System.out.println(teacher2.getTeacherID() + " " + teacher2.getTeacherName() + " " + teacher2.getTeacherSSN() + " " + teacher2.getTeacherDOB());

	}

}

package Com.Testing;

public class Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is my base class");
		
		compare("Testing", "Test");
	}
	
	public static void compare(String a, String b) {
		if(a.equalsIgnoreCase(b)) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are not equal");
		}
	}

}

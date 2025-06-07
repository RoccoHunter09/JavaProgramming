package day12;

public class OverLoadingMainMethod {
	
	void main(int x) {
		System.out.println(x);
	}
	void main(String y) {
		System.out.println(y);
	}
	void main(int x, int y) {
		System.out.println(x+y);
	}
	

	public static void main(String[] args) { //here args is argument of string array. we can change it to any value
		
		OverLoadingMainMethod met= new OverLoadingMainMethod();
     met.main(10);
     met.main("Don");
     met.main(10,20);
     met.main(42);
	}

}

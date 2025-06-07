package day15;

class test1{
	/*final*/ void m() {
		System.out.println("Rocky Handsome");
	}
}

class test2 extends test1{
	void m() {  //since above m contain final keyword so we can not perform overriding here
		System.out.println("John Wick");
	}
}

public class FinalMethod {

	public static void main(String[] args) {
		
		test2 ap=new test2();
		ap.m();
		

	}

}

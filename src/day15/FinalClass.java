package day15;

final class test11{  //since this class has final keyword, meaqns we can extend this calss
	void m() {
		System.out.println("Rocky Handsome");
	}
}

//class test21 extends test11{--this will give errror
	class test21 {
	void m() {  //since above m contain final keyword so we can not perform overriding here
		System.out.println("John Wick");
	}
}

public class FinalClass {

	public static void main(String[] args) {
		
		test21 ap=new test21();
		ap.m();
		

	}

}

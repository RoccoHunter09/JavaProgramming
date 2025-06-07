package day15;

class animal{
	String colour="White";
	void eat() {
		System.out.println("eating....");
	}
}


class dog extends animal{
	String colour="Black";
	 void displayColour() {
	System.out.println(colour+" without super keyword");
	System.out.println(super.colour+" with super keyword");
	}
	 void eat() { //override
		 System.out.println("Eating bread...");
		 super.eat();
		
		
	 }
}
public class superKeyword {

	public static void main(String[] args) {
		dog xc=new dog();
		xc.displayColour();
		xc.eat();
		
		

	}

}

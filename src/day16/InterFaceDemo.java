package day16;

interface shape{
	int length=100; //here length is final and static due to interface
	int width=10;  //here width is final and static due to interface
	 void square(int a);//here access modifier is public //Abstract(Only declaration, no implementation) method for interface.
	 void square1();	//Abstract(Only declaration, no implementation) method for interface.
	 
	 default void square2()
	 {
		 System.out.println("This is square2-default");//defaults methods are allowed in interface
	 }
	 
	 static void square3() {
		 System.out.println("This is square 3-static");//static methods are allowed in interface
	 }
}

public class InterFaceDemo implements shape{
	
	public void square1() { //to implenet iterface without any error we must have to use abstract method from interface in a class
		System.out.println("This is square1-abstract");
		
	}
	public void square(int a) {
		
		System.out.println(a);
		 
	 }

	public static void main(String[] args) {
		//scenario 1
		InterFaceDemo a1=new InterFaceDemo();
		a1.square1();
		a1.square(10);
		a1.square2();
		
		//square3(); //since this method is not not directly create3d in interface demo class . so that's why we can not directly call this method as per static properties
		shape.square3();
		
		
		//Scenario 2-for point number 9
		
		shape sh=new InterFaceDemo(); //here we are creating object for interfacedemo and storing it in interface variable sh
	sh.square(20);
	sh.square1();
	sh.square2();
	shape.square3(); //static method directly called from interface
	System.out.println(shape.length);
	
	}

}

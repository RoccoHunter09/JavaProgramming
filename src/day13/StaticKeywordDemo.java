package day13;

public class StaticKeywordDemo {
	  static int a=10;  //static variable
	 int b=20; //Non static variable
	 
	 void m1() {      //Non static method
		 System.out.println("Hello");
	 }
	 
	 static void m2() {        // static method  //(Without creating object)we can access this in other class as well by providing class name 
		 //StaticKeywordDemo.m2();
		 System.out.println("Master");
		
		 
	 }
	 
	 void m3() {   //3.Non static method can access anything directly.
		 System.out.println(a);
		 System.out.println(b);
		 m1();
		 m2();
	 }

	public static void main(String[] args) {
	//below two lines got executed without creating object because its a static
		//1.Static methods can access static stuff directly.(Without object)
		System.out.println(a);
		m2();
		//System.out.println(b);--can not access without creating object because it is non static
		//m1();can not access without creating object  because it is non static
		
		
		//2.Static methods can access non static stuff With object.
		
		StaticKeywordDemo sd=new StaticKeywordDemo();
		System.out.println(sd.b);
		sd.m1();
		
		sd.m3();
		
		

	}

}

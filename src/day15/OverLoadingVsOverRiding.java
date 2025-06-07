package day15;

class abc{
	void m1(int a) {
		System.out.println(a);
		}	
	void m2(int b) {
		System.out.println(b);
	}
}

class xyz extends abc{
	
	void m1(int a) {
		System.out.println(a*a);  //overriding(same definition diff implementation)..overriding in inheritance
		}	
	void m2(int a, int b) {
		System.out.println(a*b);  //overloading(diff definition same/diff implementation) ..overloading in inheritance
	}
}

public class OverLoadingVsOverRiding {

	public static void main(String[] args) {
		
		xyz p1=new xyz();//xyz is having 3 methods. m1 bye overriding. m2,m2 by overloading
		p1.m1(10);
		p1.m2(20);
		p1.m2(10,20);
		

	}

}

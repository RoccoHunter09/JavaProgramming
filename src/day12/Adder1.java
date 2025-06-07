package day12;

public class Adder1 {

	int a=20,b=30;
	
	void sum() {  //1
		System.out.println(a+b); 
	}
	
	void sum(int x, int y) { //2
		System.out.println(x+y); 
		
	}
	
	void sum(int x, double y) {//3
		System.out.println(x-y);
		
	}
	
	void sum(double y, int x) { //4
		System.out.println(x+y);
	}
}

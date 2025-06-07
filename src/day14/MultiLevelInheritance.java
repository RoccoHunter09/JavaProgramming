package day14;


class A{   
	int a=100;
	void display(){
		System.out.println(a);
	}

	}
class B extends A{  
	int b=200;
	void show() {
		System.out.println(b);
	}
}

class C extends B{
	int c=300;
	void show1() {
		System.out.println(c);
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		C obj=new C();
		System.out.println(obj.a);  //from C class object we got the value of A class object
		obj.display(); //from C class object we got the value of A class object
		
		System.out.println(obj.b); //from C class object we got the value of B class object
		obj.show(); //from C class object we got the value of B class object
	}

}

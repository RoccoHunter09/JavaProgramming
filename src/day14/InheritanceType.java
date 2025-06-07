package day14;

//Single inheritance
class Z{   //parent class
	int a=100;
	void display(){
		System.out.println(a);
	}

	}
class Y extends Z{  //here B is child and A is parent// now b has two variable
	int b=200;
	void show() {
		System.out.println(b);
	}
}

public class InheritanceType {

	public static void main(String[] args) {
		Y obj=new Y();
		System.out.println(obj.a);  //from Y class object we got the value of Z class object
		obj.display(); //from Y class object we got the value of Z class object
		
		
	}

}

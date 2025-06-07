package day19;

class parent{
	String name="John";
	 void m1() {
		 System.out.println("This is m1 from parent");
	 }
}
class child extends parent{
	int id=100;
	void m2() {
		System.out.println("This m2 from child");
	}
}
public class TypeCastingObject1 {

	public static void main(String[] args) {
		/*
		child c=new child();
		System.out.println(c.name); //parent
		c.m1(); //parent
		System.out.println(c.id); //child
		c.m2(); //child
		*/
		//Example 1
		//parent p=new child(); //upcasting //parentclass reference variable can hold child class object //it is upcasting.here we are storing lower thing in higher
		
		//System.out.println(p.name); //parent
		//p.m1(); //parent
		//System.out.println(p.id); // not accessible because of parent reference
		//p.m2(); // not accessible because of parent reference
		
		//Example 2(downcasting for object)
		
		parent q=new parent();
		child a=(child)q; //manually performed downcasting.here downcasting we will get run time error(NOT COMPILE TIME). so it is not preferred.
		System.out.println(a.name);
		a.m1();
		System.out.println(a.id);
		a.m2();
		

	}

}

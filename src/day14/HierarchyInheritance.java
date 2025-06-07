package day14;

class Parent{
	void display(int a) {
		System.out.println(a);
		}	
}
class child1 extends Parent{
	void show1(int b) {
		System.out.println(b);
	}
	
}
class child2 extends Parent{
	void show2(int c) {
		System.out.println(c);
	}
}

public class HierarchyInheritance {

	public static void main(String[] args) {
		
		child1 new1=new child1();
		new1.display(100);
		
		
		child2 new2=new child2();
		new2.display(200);
	

	}

}

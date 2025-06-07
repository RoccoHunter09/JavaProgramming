package day17.pack2;
import day17.pack1.Test1;
//import day17.pack1.*;  --this means importing all the classes from pack1
public class Test3 {

	public static void main(String[] args) {
		Test1 p=new Test1();
		System.out.println(p.x); //able to access from other pacakge without help of inheritance.(public modifier)
		p.m1();

	}

}

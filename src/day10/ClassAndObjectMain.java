package day10;
import day10.ClassAndObject;// if codes are present in same package then no need to import and if they are in other package then import is required

public class ClassAndObjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ClassAndObject , ClassAndObjectMain and student are related
		//Here we can see that in first code we commented main method and we are able to print object from firts code to second code with main method
		ClassAndObject a1=new ClassAndObject();
		a1.eid=13086060;   
		a1.ename="Abhishek";
		a1.job="Senior Analyst";
		a1.sal=1800000;
		a1.display();
		
		Student a2=new Student();
		a2.sid=6;
		a2.grade='A';
		a2.sname="Abhishek"; //it si possible to have same duplicate value in objects
		a2.printdata();
		
	}
	//We can create n number of class in a project but they all will be operated under one single main method
}

package day11;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Student sr=new Student();
		//Student sr1=new Student();
		//one method is normal
		
		//using method we can store data in variable
		/*sr.studentdata(6, "Abhi", 'A');
		sr.printData();
		sr1.studentdata(1, "Abhishek", 'A');
		sr1.printData();
		*/
		//using constructor--constructor name should be same as class name
		//constructor can not return any value,it is just for storing and initilizating the data
	//in constructor we can not write logic
		Student sr=new Student(11,"Abhi",'A'); //constructor will invoke object and ask for value
	sr.printData();
	
	}

}

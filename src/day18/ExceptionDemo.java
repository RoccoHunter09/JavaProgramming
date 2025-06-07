package day18;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		System.out.println("Program started....");
		
		Scanner sc=new Scanner(System.in);
		
		// Example 1
		/*System.out.println("Enter the number");
		int num=sc.nextInt();
		//int num=sc.nextInt();--infinity
		System.out.println(100/num); //arithmetic exception
		*/
		
		//Example 2
		/* int a[]=new int[5];
		 System.out.println("Enter Position(0-4)");
		 int pos=sc.nextInt();
		 System.out.println("Enter the value");
		 int val=sc.nextInt();
		 a[pos]=val; //ArrayIndexOutOfBoundsException
		 System.out.println(a[pos]);
		 */
		 
		 //Example 3
		/*String s="Welcome";
		int num=Integer.parseInt(s);//NumberFormatException
		System.out.println(num);
		*/
		
		//Example 4
		//String s="";  //it will return 0 length
		String s=null;
		System.out.println(s.length());//NullPointerException
		
		
		System.out.println("Program completed");
		System.out.println("Program exited");
		

	}

}

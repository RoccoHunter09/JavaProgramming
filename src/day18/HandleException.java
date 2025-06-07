package day18;

import java.util.Scanner;

public class HandleException {

	public static void main(String[] args) {
		
System.out.println("Program started....");
		
		Scanner sc=new Scanner(System.in);
		
		//Example 2
				 int a[]=new int[5];
				 System.out.println("Enter Position(0-4)");
				 int pos=sc.nextInt();
				 System.out.println("Enter the value");
				 int val=sc.nextInt();
				 try { //if we are not aware of statement which is causing exception we go with group of statements in try block
				 a[pos]=val; 
				 System.out.println(a[pos]);
				 }
				 catch(ArrayIndexOutOfBoundsException e) // it will only catch ArrayIndexOutOfBoundsException //if we are aware of exception, we can directly write exception name
				 {
					 
					 System.out.println("Invalid data of array position,it should be in between 0-4");
				 }
				 System.out.println("Program completed");
					System.out.println("Program exited");
				 

	}

}

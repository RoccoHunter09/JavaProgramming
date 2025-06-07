package day7;

import java.util.Scanner;

public class MultipleInputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		System.out.println("1st number");
		int num1=sc.nextInt();
		
		System.out.println("2nd number");
		int num2=sc.nextInt();
		
		
		System.out.println("Sum of num1 and num2 are: "+(num1+num2));
		
		//when program need to take unkonwn data type from user
		System.out.println("Enter Anything from your mind");
		Object pqr=sc.next();
		System.out.println(pqr);
		
		}
	
	

}

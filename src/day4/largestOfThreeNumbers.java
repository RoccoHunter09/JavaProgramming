package day4;

public class largestOfThreeNumbers {

	public static void main(String[] args) {
		int a=10,b=400,c=30;
		if (a>b && a>c) {
			System.out.println(a+" is largest number");
		}
		else if (b>a && b>c){
			System.out.println(b + " is largest number");
			
		}else {
			System.out.println(c+ " is largest number");
		}

	}

}

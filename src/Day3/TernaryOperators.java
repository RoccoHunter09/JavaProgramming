package Day3;

public class TernaryOperators {

	public static void main(String[] args) {
		//Syntax for ternary operator //var=(exp)? result1:result2
		// exp will always return true or false
		
		//example 1-how to decide which is largest number
		
		/*int a=200,b=100;
		int x=(a>b)?a:b; //if exp is correct result1 value will get assigned to x
		System.out.println(a);

		
		int a=200, b=100;
		int x=(a<b)?a:b; //if exp is incorrect result2 value will get assigned to x
				System.out.println(x);
				
		
		int x=(2==2)?100:200;
		System.out.println(x);
		int y=(2!=2)?100:200;
		System.out.println(y);
		*/
		
		//int Person_age=16;
		//String res=(Person_age>=18)? "eligible": "not eligible";
		//System.out.println(res);
		
		
		int a=300,b=20;
		String res=(a>b)? (a)+" is greater":(b)+" is greater";
		//System.out.println(res);
		
				
	}

}

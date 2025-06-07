package Day3;

public class IncrementOperator {

	public static void main(String[] args) {
		// ++ is increment operator
		//Case 1
	/*int a=10;   
	System.out.println(a);
	a=a+1;    // here a++ is same as a=a+1 
	System.out.println(a);
	a++;
	System.out.println(a);*/
		
		//Case 2--post increment
		/*int a=10;
		int res=a++; //here it is example of post increment
		System.out.println(res); //here res value will be 10 only because java will--
								//--first assign a value in res then it will increment the value of a
		System.out.println(a); //here value will be 11
	*/
		
		//Case 3--pre increment
		
		int a=10;
		int res=++a; //pre increment
		System.out.println(res); //value will be 11
		System.out.println(a); // Value will be 11

	}

}

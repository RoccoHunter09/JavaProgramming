package day17;

public class DataConversionMethod {

	public static void main(String[] args) {
	/*	// String s="Welcome";//can not convert it into integer. to convert into integer it should have numeric value.
		//Scenario 1 String to int
		String s="123456";
		int a=Integer.parseInt(s);
		System.out.println(a);
		
		
		String a1="10";
		String a2="20";
		System.out.println(a1+a2);//Concat will happen
		
		int a3=Integer.parseInt(a1);
		int a4=Integer.parseInt(a2);
		System.out.println(a3+a4); //addition will happen
		
		//Scenario 2 String to double
		String b1="10.5";
		String b2="20.58";
		double b3=Double.parseDouble(b1);
		double b4=Double.parseDouble(b2);
		System.out.println(b3+b4);
		
		//Scenario 3 String to boolean
		String c1="Welcome"; //If we pass value other than true Java will return false only
		String c2="false";
		String c3="true";
		System.out.println(Boolean.parseBoolean(c1));
		System.out.println(Boolean.parseBoolean(c2));
		System.out.println(Boolean.parseBoolean(c3));
		
		*/
		
		//int,char,double,boolean to string
		
		int q=10;
		double w=10.5;
		char e='A';
		boolean r=true;
		
		System.out.println(String.valueOf(q));
		System.out.println(String.valueOf(w));
		System.out.println(String.valueOf(e));
		System.out.println(String.valueOf(r));
		
		
		
	}

}

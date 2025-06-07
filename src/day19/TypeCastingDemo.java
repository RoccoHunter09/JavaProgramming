package day19;

public class TypeCastingDemo {

	public static void main(String[] args) {
		//Upcasting--> Converting values from smaller to larger(It is an automatic process)
		// int-->long
		//double-->float
		
		//DownCasting-->Converting values from larger to smaller(It is a manual process.)
		//long-->int
		//float-->double
		
		//Upcasting--> Converting values from smaller to larger
		/*int intvalue=100;
		long longvalue=intvalue;
		System.out.println(longvalue);
		
		float floatvalue=2.5f;
		double doublevalue=floatvalue;
		System.out.println(doublevalue);
		*/
		
		//DownCasting-->Converting values from larger to smaller
		//here we want to store larger thing in lower thing so it mighat cause the problem. reason--if a long has very big value then it might possible that int can not handle that big value
		//chance of missing or truncating of original value
		
		/*long longvalue=56787;
		int value =(int)longvalue; //manually we need to write int before the longvalue to perform downcasting
		
		double doublevalue=45.8;
		float floatvalue=(float)doublevalue;
		*/
		
		
		//example1
		int a=100;
		double d=a; //upcasting
		System.out.println(d);
		
		//example2
		double c=10.5;
		int p=(int)c; //downcasting
		System.out.println(p); //value got trunked or terminated
		
	}

}

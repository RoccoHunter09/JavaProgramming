package Day3;

public class Operators {

	public static void main(String[] args) {
		
		//Arithmetic operators  +-*/%
		int a=20, b=11;
		int result=a+b;
		System.out.println("sum of a+b:"+result);
		System.out.println("sum of a+b:"+(a+b));
		
		System.out.println("Diff of a-b:"+(a-b));
		System.out.println("multi. of a*b:"+(a*b));
		System.out.println("div. of a/b:"+(a/b));
		System.out.println("Modulo Div. of a%b:"+(a%b));
		
		/*//Relation operator > >= < <= != ==(it will return boolean value)
		int a=20, b=11;
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		boolean res=a>b;
		System.out.println(res);*/
		
		//logical operators && || !  (Return boolean from boolean)
		
		boolean x= true;
		boolean y=false;
		
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		
		
		
		
	}

}

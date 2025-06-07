package day9;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Welcome";
		String s2="Welcome";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));// If we normally use string without new keyword then "==" and "equals()" are same		
		
		
		String s3=new String("Welcome");  //new keyword will create new object each time
		String s4=new String("Welcome");
		System.out.println(s3==s4);  // == compares the object
		System.out.println(s3.equals(s4)); //equals compare the values of object

		
		String s5="Champak";
		String s6=new String("Champak");
		System.out.println(s5==s6);  // 
		System.out.println(s5.equals(s6));
		
		String s7="Champak";
		String s8=new String("Champak");
		String s9=s8;
		System.out.println("pp");
		System.out.println(s7==s9);  // false
		System.out.println(s7.equals(s9));//true
		System.out.println(s9==s8);//true bcoz object are same/equal
		
	}

}

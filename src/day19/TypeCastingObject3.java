package day19;

public class TypeCastingObject3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object o=new String("Welcome"); //object is supercalss fo all the class
		//StringBuffer sb=(StringBuffer)o;////valid as per rule 1 and rule 2 and invalid for rule 3
		
		//String o=new String("Welcome"); 
		//StringBuffer sb=(StringBuffer)s; //rule 1 failed
		
	//	Object o=new String("Welcome");
		//StringBuffer sb=(StringBuffer)o;//valid as per rule 1 and rule 2 and invalid for rule 3
		
		//Object o=new String("Welcome");
		//StringBuffer sb=(String)o; //Rule 1 pass, rule 2 fails
		
		//String s=new String("Welcome"); 
		//StringBuffer sb=(String)s; //rule 2 failed
		
		//Object o=new String("Welcome");
		//StringBuffer sb=(StringBuffer)o;//valid as per rule 1 and rule 2 and invalid for rule 3
		
		Object o=new String("Welcome");
		String s=(String)o; //valid as per rule 1,2 and 3
		System.out.println(s);
		
		
	}
 //
}

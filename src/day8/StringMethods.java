package day8;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Abhishek";
	//	String s=new String("Abhishek");--both are same
		
		
		
		//length
		System.out.println(s.length());
		System.out.println("Homelander".length());
		
		//concat--joining strings
		
		String s1="Adam";
		String s2="Gilchrist";
		String s3="Australia";
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1.concat(s2).concat(s3));
		
		//trim--remove spaces from right and left
		
		 s="  Abhishek  ";
		 System.out.println(s);
		 System.out.println(s.length());
		 System.out.println(s.trim());
		 System.out.println(s.trim().length());
		 
		 //charAt--return character from string based on index,index strats from 0
		 
		 s="Abhishek";
		 System.out.println(s.charAt(3));
		 
		 
		//Imp //contains()--to verify whether string is part of main string--it always return boolean value
		 //-it is case sensitive
		 s="Welcome to jungle";
		 s1="jun";
		 s2="unl";
		 s3="Jun";
		 System.out.println(s.contains(s1));
		 System.out.println(s.contains(s2));
		 System.out.println(s.contains(s3));
		
		 
		 //Imp // equals() ,equalsIgnorecase()--both are used for comparing strings
		 s1="Abhishek";
		 s2="Abhishek";
		 s3="abhishek";
		 System.out.println(s1==s2);
		 System.out.println(s1==s3);// == is case sensitive
		 System.out.println(s1.equals(s2));
		 System.out.println(s1.equals(s3));//equals is also case sensitive
		 System.out.println(s1.equalsIgnoreCase(s3));//not case sensitive
		 
		 
		 //replace()--it will replace single and multiplechar(Sequence) from a string
		 s1="I am the best in the world";
		 System.out.println(s1.replace('a', 'e'));
		 System.out.println(s1.replace("the", "Still the"));
		 
		 //substring()-it will substract substring from main string
		 // starting index will start from 0
		 //ending index will start from 1
		 s1="Abhishek";
		 System.out.println(s1.substring(0, 4));
		 
		 
		 //toUpperCase() ,toLowerCase()
		 
		 s1="abhishek";
		 s2="Abhishek";
		 System.out.println(s1.toUpperCase());
		 System.out.println(s2.toLowerCase());
		 
		 
		 //split()--split the strings into multiple parts based on delimeter(@,.)Split will returm array of element
		 // * % & ^ ( ) --can not be used as delimeter		
		
		 s1="abc@gmail@com";
		 s1.split("@"); //it will be splitted into 3 parts
		String a[]=s1.split("@");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(Arrays.toString(a));
		 
		//ex1
		String amount="$15,16,17,18,19";
		 s=amount.replace("$", "");
		System.out.println(s);
		String b=s.replace(",", " ");
		System.out.println(b);
		
		//ex2
		 String pq="abc,123@xyz";
		 String z[]=pq.split(",");
		 System.out.println(Arrays.toString(z));
		 String x[]=z[1].split("@");
		 System.out.println(Arrays.toString(x));
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		 
		 
		 
		 
		 

	}

}

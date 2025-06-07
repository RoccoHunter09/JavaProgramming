package day9;

import java.util.Arrays;

public class ReverseAString {

	public static void main(String[] args) {
		
		//Approach--using length and charAt
		String a="welcome";
		System.out.println(a.length());
		
		for(int p=a.length()-1;p>=0;p--) {
			System.out.print(a.charAt(p));
		}
		System.out.println();
		
		//2nd approcah-without string method--by converting string to char array type
		
		String b="Abhishek";
		char[] q=b.toCharArray();
		System.out.println(Arrays.toString(q));
		System.out.println("Before reversal of string");
		for (int m=0;m<q.length;m++) {
			System.out.print(q[m]);
		}
		
		System.out.println();
		System.out.println("After reversal");
		
		for(int n=q.length-1;n>=0;n--) {
			System.out.print(q[n]);
			
			
			
			
			
		}System.out.println();
		
		
		//3rd approcah-Using string buffer
		StringBuffer d=new StringBuffer("Samridhi");
		System.out.println(d.reverse());
		
		//4th approcah-Using string builder
		
		StringBuilder t=new StringBuilder("Bhau");
		System.out.println(t.reverse());

	}

}

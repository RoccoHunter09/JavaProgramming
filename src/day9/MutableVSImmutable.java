package day9;

import java.util.Arrays;

public class MutableVSImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,5,7,6};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a)); //Here original value is getting changes so it is mutable
		
		String p="Welcome";
		p.concat("Raju");
		System.out.println(p);// Here p is not getting changed means string are immutable
		
		//String is the only mutable thing in java.

	}

}

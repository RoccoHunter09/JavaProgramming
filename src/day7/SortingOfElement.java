package day7;

import java.util.Arrays;

public class SortingOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,4,3,8,6,6,9};
		System.out.println("Before sorting numbers are..");
		System.out.println(Arrays.toString(a));
		//for(int value:a) {
		//	System.out.println(value);
		//}
		
		Arrays.sort(a);
		System.out.println("After sorting");
		System.out.println(Arrays.toString(a));
		

	}

}

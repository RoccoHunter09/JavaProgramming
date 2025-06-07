package day7;

import java.util.Arrays;

public class SortWithForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {7,5,8,4,55,43,34,56};
		 for(int i=0;i<a.length-1;i++) {
			 
			 if(a[i]>a[i+1]) {
				 int temp=a[i+1];
				 a[i+1]=a[i];
				 a[i]=temp;
				 i=-1;
			 }
			 
			 
			 /* if(a[i]>a[i+1]) {
				 int temp=a[i];
				 a[i]=a[i+1];
				 a[i+1]=temp;
				 i=-1;
			 }*/
		 }System.out.println(Arrays.toString(a));
		
	}

}

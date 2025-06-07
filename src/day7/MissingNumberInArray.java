package day7;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,4,5,6,7,9};
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i]+1==a[i+1]) {
				
			}else {
				System.out.println("Missing numbers is: " +(a[i]+1) );
			}
			
			
		}

	}

}

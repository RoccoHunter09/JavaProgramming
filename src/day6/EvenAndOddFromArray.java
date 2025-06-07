package day6;

public class EvenAndOddFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		
		for(int p=0;p<a.length;p++) {
			if(a[p]%2==0) {
				System.out.println(a[p]+ " is even number");
				
			}else {
				System.out.println(a[p]+ " is odd number");
			}
		}
		
	

	}

}

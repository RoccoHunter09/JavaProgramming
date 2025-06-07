package day7;

public class FindElementInArray {

	public static void main(String[] args) {
		// Find element in array(Linear search)
		int a[]= {1,2,3,4,5,6};
		int b=7;
		boolean status=true;  //use of boolean is necessary here 
				
				;
		for(int p=0;p<a.length;p++) {
			if(b==a[p]) {
				System.out.println(b+" is present in array");
				status=false;
				break;
				
			
		}
		
		
		}
		if(status) {
			System.out.println(b +" is not present in array");
			}

	}

}

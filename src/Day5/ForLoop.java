package Day5;

public class ForLoop {

	public static void main(String[] args) {
		// print 1 to 5
		/*for(int i=1;i<=5;i++) {
			System.out.println(i);
		}

		//Print 1 to 10 even numbers
		
		for(int i=1;i<=10;i=i+2) {
			System.out.println(i);
			
		}*/
		
		//print even and odd between 1 to 10
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i+" Even");
			}
			else {
				System.out.println(i+" Odd");
			}
		}
		
		
	}

}

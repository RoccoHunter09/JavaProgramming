package Day5;

public class HomeworkSumOfDigitInNumber {

	public static void main(String[] args) {
		// Sum of digit in a number
		
		int a=12344;
		int p=0;
		int q=0;
		while (a>0) {
			
		p=a%10;
		q=q+p;
		a=a/10;
		
		}System.out.println(q);
		
		
 
		
	}

}

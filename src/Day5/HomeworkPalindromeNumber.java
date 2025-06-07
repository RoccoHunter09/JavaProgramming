package Day5;

public class HomeworkPalindromeNumber {

	public static void main(String[] args) {
		int a=4341;
		int org_a=a;
		int p=0;
		while(a!=0) {
			p=p*10 +a%10;
			a=a/10;
			
		}
		
		
		if(org_a==p) {
		
		System.out.println(p+" Number is palindrome" );
		}else{
			System.out.println(p+" not a palindrome number");
			}
	
		

	}

}

package Day5;

public class HomeworkCountEvenOdd {

	public static void main(String[] args) {
		long a=1885668;
		long b=0;
		long c=0;
		long q=0;
		
	while(a!=0) {
		
		q=a%10;
		//System.out.println(q);
		a=a/10;
		//System.out.println(a);
		if (q%2==0) {
			b=b+1;
			
			
		}else {
			c=c+1;
			
		}
		
	}System.out.println(b+" even Number");
	System.out.println(c+" Odd Number");
	
	

	}

}

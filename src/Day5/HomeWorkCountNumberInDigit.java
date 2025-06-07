package Day5;

public class HomeWorkCountNumberInDigit {

	public static void main(String[] args) {
		int a=123456789;
		int p=0;
		
		while(a!=0) {
			
			p=p+1;
			a=a/10;
			
			
		}System.out.println(p);

	}

}

package Day5;

public class HomeworkReverseANumber {

	public static void main(String[] args) {
		
		//method 1
		/*int a=1234;
		int b=a/10; //123
		int c=b/10; //12
		int d=c/10;  //1
		int e=a%10;
		int f=b%10;
		int g=c%10;
		int h=d%10;
		System.out.print(e);System.out.print(f);System.out.print(g);System.out.print(h);
		
		//method 2
		
		int a=1234;
		int num=0;
		while(a!=0) {
			num=num*10 + a%10;
			
			a=a/10;
		}
		System.out.println(num);*/
		int p=4321;
		int q=0;
		
		while(p!=0) 
		{
			q=q*10 + p%10;
			p=p/10;
			
			
		}
		System.out.println(q);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}

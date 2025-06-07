package StarPattern;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  *  
		// ***
		//*****
		
	
		
		int row=5;
		int q=1;
		
		for(int i=1;i<=row;i++) {
			
			for(int j=row;j>i;j--) {
				System.out.print(" ");
			}
			for (int k=1;k<=q;k++) {
				System.out.print("*");
			}q=q+2;
			System.out.println();
		}
	}

}

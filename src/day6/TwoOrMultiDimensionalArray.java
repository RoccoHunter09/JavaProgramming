package day6;

public class TwoOrMultiDimensionalArray {

	public static void main(String[] args) {
		/* 
		1 Declare an array
		2 add values into array
		3 find length of an array
		4 read single value from an array
		5 read multiple values from an array
				 */
		
		//Declaring array
		
		//Approach 1
		
		int a[][]=new int[3][2];  //int [][]a=new int[3][2];---both Correct--- int []a[]=new int[3][2];
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
		//System.out.println(a[1][1]);
		
		//Approach 2
		
		int b[][]= {{100,200},{300,400},{500,600}};
		
		//size of multi dimensional aaray
		
		//System.out.println("length of rows:"+b.length );
		//System.out.println("length of columns:"+a[0].length);
		
		//read singlevalue from an array
		
		//System.out.println(a[1][1]);
		
		/*
		 int i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
		 */
		
		
		
		//read all values from an array from whileloop
		
		/*int p=0;
		int q=0;
		
		
		while (p<3) {
			
			while(q<2) {
				
				System.out.println(a[p][q]);
				q++;
			}p++;
			q=0;
			
		
			
		}
		*/
		
		//read all values from an array from for loop
		
		for(int x=0;x<3;x++)
		{
			for(int y=0;y<2;y++){
				
				System.out.println(a[x][y]);
			}
		}
		
		
		//read all values from an array from for loop in tabular form
		
				for(int x=0;x<3;x++)
				{
					for(int y=0;y<2;y++){
						
						System.out.print(a[x][y]);
						System.out.print(" ");
					}System.out.println();
				}
				
				//Enhanced for loop/for each loop
				
				for(int arr[]:b) {  //arr will store data from 1st row..and it will keep storing till last index number
					for(int x:arr) {  //x will store the data from arr
						System.out.print(x);
						System.out.print(" ");
						
					}    System.out.println();                                                    
						
				}
				
		

	}

}

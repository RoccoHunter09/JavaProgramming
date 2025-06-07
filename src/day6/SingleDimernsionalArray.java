package day6;

public class SingleDimernsionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
1 Declare an array
2 add values into array
3 find length of an array
4 read single value from an array
5 read multiple values from an array
		 */
		
		//declaring array and add values into array
		
		//Approach 1--if array is fixed and we do not want to add anything in future
		int a[]=new int[5];  //int []a=new int[5];--also correct
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		//Approach 2--if array is not fixed and we want to add something in future
		
		int b[]= {800,200,300,800,500};
		
		
		//lenght of an array
		//System.out.println(a.length);
		//System.out.println(a.length+b.length);
		
		//read singlevalue from an array
		
		
	//	System.out.println(a[3]);  //3 is index number here
		
		//read multiple values from an array with while loop
		int p=0;
		while(p<5)
		{
			
			//System.out.println(a[p]);
			p=p+1;	
		}
		//read values with normal for loop
		for (p=0;p<5;p++) {
			//System.out.println(b[p]);
			
		}
		//Enhanced for loop/for each loop
			for (int x:a) {
				System.out.println(x);
			}
	}

}

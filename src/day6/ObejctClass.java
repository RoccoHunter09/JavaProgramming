package day6;

public class ObejctClass {

	public static void main(String[] args) {
		//Object Class--know as root class or super class. with the help of this we can store multiple data in array
		
		Object a[]= {100,10.5,'a',"Abhishek",true};
		
		//for(Object x:a) {
		//	System.out.println(x);
	//	}
		
		//normal for loop
		System.out.println(a.length);
		for(int p=0;p<a.length;p++) {
			System.out.println(a[p]);
			
		}

	}

}

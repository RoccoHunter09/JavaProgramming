package day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException { //throws to catch exception
		System.out.println("Program started");
		System.out.println("Program in progress");
		
		//using try and catch
		/*try {
		FileInputStream file=new FileInputStream("C:\\.txt");}//file might be or might not be available
		
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		
		
		try {
		Thread.sleep(1000); //checked exception //it is related to multi threading and memory location. there will be chance that two program are running on same memory location, so they might get interrupted
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		*/
		
		Thread.sleep(2000);
		System.out.println("Program completed");
		System.out.println("Program exited");
		
		

	}

}

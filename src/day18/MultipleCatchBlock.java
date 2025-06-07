package day18;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		System.out.println("Program started....");
		
		
				String s=null;
				try {
				System.out.println(s.length());
				}
				catch(NullPointerException e) {  //one try block can have multiple catch block. but at a time only one catch block will get executed.
					// if no exception found then all catch block will get ignored
					System.out.println("Handle Exception");
					System.out.println(e.getMessage()); //it will give exception message
					
				}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Handle Exception");
					System.out.println(e.getMessage());
				}
				catch(NumberFormatException e) {
					System.out.println("Handle Exception");
					System.out.println(e.getMessage());
				}
				System.out.println("Program completed");
				System.out.println("Program exited");

	}

}

package day18;

public class FinallyBlock {

	public static void main(String[] args) {
		String s=null;
		try {
		System.out.println(s.length());
		}
		catch(Exception e) { //if we are not aware of exception type.It will cover all type of exception
			System.out.println("Handle Exception for catch block");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Entered in finally block");
		}
		
		
		System.out.println("Program completed");
		System.out.println("Program exited");

	}

}

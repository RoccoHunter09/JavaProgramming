package day18;

public class AllExceptionWithOneCatchBlock {

	public static void main(String[] args) {
		System.out.println("Program started....");
		
		
		String s=null;
		try {
		System.out.println(s.length());
		}
		catch(Exception e) { //if we are not aware of exception type.It will cover all type of exception
			System.out.println("Handle Exception");
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Program completed");
		System.out.println("Program exited");

	}

}

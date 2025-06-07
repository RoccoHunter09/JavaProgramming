package day11;

public class Greetings {
//Created this class just for methods
	
	// 1. no parameter--no return value
	
	void m1() {
		System.out.println("Hello....");
		
		
		
	}
	
	//2. no parameter--return value
	
			String m2() {
			return ("I am the best");} //this will return some value. so we need some variable to store this

			
		//	3. takes parameter--no return value	
			
			
		void m3(String name){
				System.out.println("Hello "+name);
			}

		
//		4. takes parameter-- return value	
		
		String m4(String name){
			return("Hello "+name);
		}

}


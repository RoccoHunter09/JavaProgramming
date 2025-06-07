package day4;

public class nestedIfElse {
	public static void main(String[] args) {
		
		if(true) {
			if (true) {
			System.out.println("123");
		}
		else {
			System.out.println("xyz");
		}
		}
		else {
			System.out.println("abc");
		}
		//
		
		if(true) {
			if (false) {
			System.out.println("123");
		}
		else {
			System.out.println("xyz");
		}
		}
		else {
			System.out.println("abc");
		}
		//
		if(false) {
			if (true) {
			System.out.println("123");
		}
		else {
			System.out.println("xyz");
		}
		}
		else {
			System.out.println("abc1");
		}

}
}

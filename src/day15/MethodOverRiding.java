package day15;

class bank{
	double roi() {
		return 0;
	}
}

class icici {
	double roi() {
		return 10.5;  //method overriding
	}
}

class sbi{
	double roi() {
		return 11.5;  //method overriding
	}
}

public class MethodOverRiding {

	public static void main(String[] args) {
		
		icici ic=new icici();
		System.out.println(ic.roi());
		
		sbi sb=new sbi();
		System.out.println(sb.roi());

	}

}

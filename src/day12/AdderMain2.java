package day12;

public class AdderMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Adder1 addobj=new Adder1();
		addobj.sum(); //1st method
		
		addobj.sum(5, 6); //2nd method
		
		addobj.sum(2, 3.63); //3rd method
		
		addobj.sum(4.34, 6); //4th method

	}

}

package day15;

class d{
	final int x=100;


public class FinalKeyword {

	public static void main(String[] args) {
		 d var=new d() ;
		 {
			 //var.x=200; //we made x =100 as finalvalue/ we can not change here now.
			 System.out.println(var.x);
		 }

	}

}
}

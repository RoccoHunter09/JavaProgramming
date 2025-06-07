package day11;

public class GreetingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 Greetings gr=new Greetings();
 //1
 gr.m1();
 //2
 String p=gr.m2();
 System.out.println(p);
 System.out.println(gr.m2());
 //3
 gr.m3("Abhishek");
 
 //4
 String q=gr.m4("Abhishek");
 System.out.println(q);
 System.out.println(gr.m4("Abhishek"));
	}

}

package day16;

public class C1_multipleInheritanceWithI1I2 extends C2 implements I1,I2{  //if we remove extends c2 then it will be multiple inheritance otherwise it will be hybrid inheritance
	//hybrid is mixture of hierarchy and multiple
	public void m1() {
		System.out.println(x);
	}
	public void m2() {
		 System.out.println(y);
		
	}
	
	public static void main(String[] args) {
		C1_multipleInheritanceWithI1I2 obj=new C1_multipleInheritanceWithI1I2();
		obj.m1();
		obj.m2();
		obj.m3();

}
}
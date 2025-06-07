package day12;

public class BoxMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box1 vol=new Box1();{
		System.out.println(vol.volume()); //1
		}
		
		Box1 vol1=new Box1(10.2,12.2,12.3);{
			System.out.println(vol1.volume());
		}
		
		Box1 vol11=new Box1(10.1);
		{System.out.println(vol11.volume());
			}
		
		
//need to clear whether polymorphism is possible in constructor or not
	}

}

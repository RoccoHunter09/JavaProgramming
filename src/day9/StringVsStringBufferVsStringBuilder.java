package day9;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String p="Superman";
		p.concat(" IS best");
		System.out.println(p);//Immutable--Value did not get changed
		
		StringBuffer q= new StringBuffer("Batman");
		q.append(" is the best");  //append is as same as concat in buffer and building
		System.out.println(q);//mutable--Value got changed
		
		StringBuilder r=new StringBuilder("Captain America");
		r.append(" is 2nd Best");
		System.out.println(r);//mutable--Value got changed
		//
		

	}  

}

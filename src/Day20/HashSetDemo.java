package Day20;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo {

	public static void main(String[] args) {
		
		
		// Declaration
		
		//below two can store heterogenous data
		 HashSet h1=new HashSet();
	//	 Set h2=new HashSet();
		 
		 //below is for homogenous data
		 
		// HashSet  <String>h3=new HashSet<String>();
		 
		 
		 //Adding elements into hashset
		 
		 h1.add(100);
		 h1.add(100);
		 h1.add(true);
		 h1.add(null);
		 h1.add(null);
		 h1.add(10.5);
		 
		 //printing hashset
		 System.out.println(h1);
		 
		 //removing element frrom hashset
		 
		 h1.remove(10.5); //here instead of index , we need to pass direct value
		 System.out.println(h1);
		 
		 //insering element---it is not possible in hashing technique.
		 
		 //accessing specific element is not possible
		  
		 
		 //converting hashset into arraylist
		 
		 ArrayList al=new ArrayList(h1);
		 System.out.println(al);
		 System.out.println(al.get(2));
		 
		 // with help of normal for loop we can not read data from hashset, we indexing is not allowed here
		 
		 //we can use enhance for loop
		 for(Object x:h1) {
			 System.out.println(x);
		 }
			 //using iterator
			 
			 Iterator it=h1.iterator();
			 while(it.hasNext()) {
				 System.out.println(it.next());
		 }
	
	//Clearing all the elements from hashset
			 
			 h1.clear();
			 System.out.println(h1);
			 
			 //is empty
			 System.out.println(h1.isEmpty());
	//size
			 System.out.println(h1.size());
	}

}

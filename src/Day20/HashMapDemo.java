package Day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// below are two types of declaration
		
		HashMap hm=new HashMap();
		
		HashMap <Integer,String> hm1=new HashMap<Integer,String>();

		//Adding pairs
		hm.put(101, "Abhishek");
		hm.put(101, "Abhishek");
		hm.put(102, "Abhishek");
		hm.put(103, "Bogi");
		hm.put(104, "vishal");
		hm.put(105, "aman");
		hm.put(101, "pratap");
		
		System.out.println(hm);
		
		//size
		System.out.println(hm.size());
		
		//remove pair--basedc on the key we can remove pair
		 hm.remove(105);
		 System.out.println(hm);
		 
		 //access value of the particular key
		 System.out.println(hm.get(101));
		 
		 //get all the keys from hashmap
		  
		 System.out.println(hm.keySet());
		 System.out.println(hm.values());
		 System.out.println(hm.entrySet());
		 
		 //reading data from hashmap using enh. for loop
		 
		 for(Object k:hm.keySet()) {
			 System.out.println(k +" "+hm.get(k));
		 }
		
	
		 //using iterator
		Iterator<Entry>  it=hm.entrySet().iterator(); //need to import predefined entry class
		 while(it.hasNext()) {
			 Entry entry=it.next();
			 System.out.println(entry.getKey()+"  "+entry.getValue());
	 }
		 
	//to clear
		 hm.clear();
		 
		 //is empty
		 System.out.println(hm.isEmpty());
		
		 
	
	}

}

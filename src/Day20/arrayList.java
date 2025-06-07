package Day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Declaration
		
		//below two can store heterogenous data
		ArrayList mylist=new ArrayList();
		//List mylist1=new ArrayList(); //we can hold child class object  in parent class object
	
		//for homogenous data we need to use wrapper class/objectType of datatype
	
	//ArrayList <String>mylist=new ArrayList<String>();
	//ArrayList <Employee>myList=new ArrayList<Employee>();
		
		
		//Adding data into array list(at last position)
		
		mylist.add(2);
		mylist.add(10.5);
		mylist.add('a');
		mylist.add("Abhishek");
		mylist.add(2);
		mylist.add(true);
		mylist.add(null);
		
		//Size of array list
		System.out.println(mylist.size());
		
		//printing arraylist
		System.out.println(mylist);
		
		//Removing a data from arraylist
		
		mylist.remove(4);
		System.out.println(mylist);
		
		//insert element in arraylist(in middle of arraylist)
		mylist.add(2, "Billa");	
		System.out.println("After insertion "+mylist);
		
		//modify element in the arraylist(modify/replace/change)
		mylist.set(2, "salar");
		System.out.println("After replacing  "+mylist);
		
	//access specific element from array list
		System.out.println(mylist.get(2));
		
		
		//Reading all the elements from array list
	
		//normal for loop
		for(int i=0;i<mylist.size();i++) {
		System.out.println(mylist.get(i));
		}
		//using enhance for loop
		for(Object x:mylist) {
			System.out.println(x);}
			
		//Iterator(Specific to collection)	
			
		//	mylist.iterator(); //it will return Itrator type of object
			
			Iterator it=mylist.iterator();
			
			while(it.hasNext()) {
				System.out.println("Iterator "+it.next());
			}
			
			
		//checking arraylist empty or not
			
			System.out.println(mylist.isEmpty());
			
		//To remove multiple elements from array list
			ArrayList mylist2=new ArrayList();
			mylist2.add("Welcome");
			mylist2.add(10.5);
			mylist2.add(2);
			
			mylist.removeAll(mylist2);
			System.out.println(mylist);
			
		//to clear all the element
			mylist.clear();
			System.out.println(mylist);
			
			
		
	
	}

}

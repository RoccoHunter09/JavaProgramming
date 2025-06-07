package day19;
class animal{} //parent class

class dog extends animal{
	
} //child class

class cat extends animal{} //child class

//rule-- cat ct=(cat) an;
//        A   b   C    d  
public class TypeCastingObjects2 {

	public static void main(String[] args) {
		
		//Imp*--If rule 1 and 2 fails it will give compile time error and if rule 3 will fail it will runtime error
		
		//Rule 1--conversion is valid or not
		
		
		//The type of d and c must have relationship.either parent to child or child to parent
		//animal an=new dog();
		//cat ct=(cat) an; //valid as per rule 1
		
		//dog dg=new dog();
		//cat ct=(cat)dg; //invalid as per rule 2
		
		//Rule 2--Assignment is valid or not
		// C must be either same or child of A
		
		//animal an=new dog();
		//cat ct=(cat) an; //valid as per rule 1 and rule 2
		
		//animal an=new dog();
		//cat ct=(dog) an; //rule 1 satisfied and rule 2 is invalid
		
		//Rule 3-- The underlying object type of d must be either same or child of C
		
		//animal an=new dog();
		//cat ct=(cat) an; ////valid as per rule 1 and rule 2 and invalid for rule 3
		
		animal an=new dog(); //here dog is underlying object of an
		dog dg=(dog)an; //valid as per rule 1 and rule 2 and rule 3
		
		
		
		
	}

}

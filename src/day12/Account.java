package day12;

public class Account {
	
	private int account;
	private double salary;
	private String name;
	void SetAcc(int Accno) { //here we set local variable same as class variable. so while getting data for method willget confused which one is local and which one is class variable. so in this code will return default integer value which is zero
	// to solve local variable issue we can use this method.
	account=Accno;
	//this.account=account;
	}

	int GetAcc() {
	return account;
	}

	
	//if we have 20-30 variable then it is hard to create get and set method for each variable manually. in this scenarios we can directly create getters and setters for each variable by using eclipse. go to source and select generate setters and getters

	
	
}
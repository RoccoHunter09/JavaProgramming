package day12;

public class AccountMain {

	public static void main(String[] args) {
		
		Account acc=new Account();
		acc.SetAcc(101);
		//acc.account;--its a private variable that why we need to access through get and set method
		System.out.println(acc.GetAcc());

	}

}

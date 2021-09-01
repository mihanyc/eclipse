package cucumberproject.cucumberproject;

public class Bank {

	int balance;
	public Bank(int b){
		balance=b;
		
	}
	public void depoit(int t) {
		balance=balance + t;
		
		
	}
	public void withdraw(int t) {
		 balance = balance - t;
	}
	public int getBalance(){
		return balance;
	}

}

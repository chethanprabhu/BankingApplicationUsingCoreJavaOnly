package bankingApplication;

public class SavingsAccount implements Account{
    int balance = 0;
	@Override
	public void deposit(int amt) {
		balance = balance + amt;
		System.out.println(amt + " amount Deposited");
	}

	@Override
	public void withdraw(int amt) {
		if(balance >= amt) {
		balance = balance - amt;
		System.out.println(amt+ " amount withdrawn");
		}else {
			System.out.println("Sorry! insuffecient funds! Withdraw unsuccessful");
		}
	}

	@Override
	public int curBalance() {
	    return balance;
	}

}

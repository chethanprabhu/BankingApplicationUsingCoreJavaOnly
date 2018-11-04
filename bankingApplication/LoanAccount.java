package bankingApplication;

public class LoanAccount implements Account{
	int balance = 0;
	@Override
	public void deposit(int amt) {
		if(balance >= amt) {
	balance -= amt;
	if(balance == 0) {
		System.out.println("Congratulations! Your LOAN has been cleared");
		return;
	}
	System.out.println(amt + " Reduced from your due amount. You still have "+ curBalance() + " pending balance!");	
		}else {
			System.out.println("Please pay only the pending amount! The amount that u entered is more than your pending amount");
		}
	}

	@Override
	public void withdraw(int amt) {

		balance += amt;
		System.out.println(amt + " Added to your due amount. Your total pending balance is "+ curBalance());
		}

	@Override
	public int curBalance() {
    return balance;
	}

}

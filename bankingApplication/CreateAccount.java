package bankingApplication;

import java.util.Scanner;

public class CreateAccount {

static Account getAcc() {
	System.out.println("What account you want to create???");
	System.out.println("Press 1 for savings account");
	System.out.println("Press 2 for loan account");
	Scanner s1 = new Scanner(System.in);
	int choice = s1.nextInt();
	Account a1 = null;
	switch(choice) {
	case 1: a1 =new SavingsAccount();
			break;
	case 2: a1 =new LoanAccount();
			break;
	default : System.out.println("WRONG SELECTION");
	}
	//s1.close();
	return a1;
	
}

}

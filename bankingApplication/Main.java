package bankingApplication;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {	
		Scanner sc1 = new Scanner(System.in);
		Account a1 = CreateAccount.getAcc();
		int choice = -1;
		while(choice != 4) {
		System.out.println("Press 1 to Add money");
		System.out.println("Press 2 to Deduct money");
		System.out.println("Press 3 to Check Balance");
		System.out.println("Press 4 to exit");
		System.out.println("Press any other number to Re-run the program");
		choice = sc1.nextInt();
		switch(choice) {
		case 1 : System.out.println("Enter amount to add");
			     int deposit = sc1.nextInt();
			     a1.deposit(deposit); break;
		case 2 : System.out.println("Enter amount to deduct");
	    		 int withdraw = sc1.nextInt();
	             a1.withdraw(withdraw); break;
		case 3 : System.out.println("Your current balance is " + a1.curBalance()); break;
		case 4 : System.out.println("Thank you for using our application");	
				 choice = 4; break;
		default : break;
		}   
		}
		//sc1.close();
	}
}

package aplication.account.program;

import aplication.account.Account;
import aplication.account.BusinessAccount;
import aplication.account.SavingAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		acc.getBalance();
		// UPCASTING

		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingAccount(10004, "Anna", 0.0, 0.01);
		acc1.getBalance();
		acc2.getBalance();
		//acc3.deposit(500);
		// DOWCASTING = CONVERTER UM OBJETO DA superclasse PARA subCLASSE
		
		//BusinessAccount acc4 = (BusinessAccount) acc2;// TypeCast
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5  = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan");
		}
		
		if (acc3 instanceof SavingAccount) {
			SavingAccount acc5 = (SavingAccount)acc3;
			acc5.updateBalance();
			System.out.println("update");
		}
	}
}

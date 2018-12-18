package aplication.account.program;

import aplication.account.Account;
import aplication.account.SavingAccount;

public class Run {

	public static void main (String []args) {
		
		Account account = new Account(10001, "Nicolas", 1000);
		account.withdraw(200);
		System.out.println(account.getBalance());
		
		
		Account account2 = new SavingAccount(10002, "Luiz", 1000, 0.01);
		account2.withdraw(200);
		System.out.println(account2.getBalance());
	}
}

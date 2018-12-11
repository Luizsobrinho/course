package aplication.account;

public class BusinessAccount extends Account {

	private double loanLimit;

	public BusinessAccount() {

	}

	public BusinessAccount(double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(double loanLimit) {
		this.loanLimit = loanLimit;
	}
}

package aplication.account;

public class SavingAccount extends Account {

	private Double interesRate;

	public SavingAccount() {
		super();
	}

	public SavingAccount(Integer number, String holder, double balance, Double interesRate) {
		super(number, holder, balance);
		this.interesRate = interesRate;
	}
	@Override
	public void withdraw(double amount) {
		this.balance -= amount ;
	}

	public Double getInteresRate() {
		return interesRate;
	}

	public void setInteresRate(Double interesRate) {
		this.interesRate = interesRate;
	}

	public void updateBalance() {
		balance += balance * interesRate;
	}
}

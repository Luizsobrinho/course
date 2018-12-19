package aplication.payer;

public class Company extends TaxPayer {

	private int numberOfEmployees;

	public Company() {

	}
	
	public Company(String name, double anuallicome, int numberOfEmployees) {
		super(name, anuallicome);
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		if (this.numberOfEmployees > 10) {
			return getAnuallicome() * 1.4;
		} else
			return getAnuallicome() * 1.6;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

}

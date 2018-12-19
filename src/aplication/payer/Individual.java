package aplication.payer;

public class Individual extends TaxPayer {

	private double healthExpenditures;

	public Individual() {

	}

	public Individual(String name, double anuallicome, double healthExpenditures) {
		super(name, anuallicome);
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {

		if (getAnuallicome() < 20000.00) {
			return (getAnuallicome() * 1.5) - (healthExpenditures * 5.0);
		} else
			return (getAnuallicome() * 2.5) - (healthExpenditures * 5.0);
		
	}

	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

}

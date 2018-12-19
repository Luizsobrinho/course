package aplication.payer;

public abstract class TaxPayer {

	private String name;
	private double anuallicome;

	public TaxPayer() {

	}

	public TaxPayer(String name, double anuallicome) {

		this.name = name;
		this.anuallicome = anuallicome;
	}
	
	public abstract double tax();
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAnuallicome() {
		return anuallicome;
	}

	public void setAnuallicome(double anuallicome) {
		this.anuallicome = anuallicome;
	}
	
	
}

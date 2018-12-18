package aplication.products;

public class ImportedProduct extends Product {

	private double customsFee;

	public ImportedProduct() {

	}

	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	@Override
	public String PriceTag() {
		double total = getPrice() + customsFee;
		return getName() + " $ " + total + " (Customs Fee: $ " + customsFee + ")";
	}
	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}

}

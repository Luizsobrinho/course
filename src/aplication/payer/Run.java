package aplication.payer;

public class Run {

	public static void main(String[] args) {

		TaxPayer payer = new Individual("Nicolas", 50000.00, 2000.00);
		System.out.println(payer.tax());
		
		TaxPayer payer2 = new Company("Gildenilson", 400000.00, 25);
		System.out.println(payer2.tax());
	}

}

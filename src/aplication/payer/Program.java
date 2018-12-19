package aplication.payer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		List<TaxPayer> payers = new ArrayList<>();

		System.out.println("Enter the number of tax payers: ");
		int n = ler.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + "data: ");
			System.out.println("Individual or company (i/c)? ");
			char cn = ler.next().charAt(0);
			ler.nextLine();
			System.out.println("Name: ");
			String name = ler.nextLine();
			System.out.println("Anual income: ");
			
			double anuallicome = ler.nextDouble();

			if (cn == 'i') {
				System.out.println("Health expenditures: ");
				double healthExpenditures = ler.nextDouble();
				payers.add(new Individual(name, anuallicome, healthExpenditures));
			} else {
				System.out.println("Number of employees: ");
				int numberOfEmployees = ler.nextInt();
				payers.add(new Company(name, anuallicome, numberOfEmployees));
			}
		}

		for (TaxPayer taxPayer : payers) {
			System.out.println(taxPayer.getName()+ ": $ "+taxPayer.tax());
		}
		ler.close();
	}

}

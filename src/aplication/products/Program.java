package aplication.products;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

public class Program {
	public static void main(String[] args) throws ParseException {

		Scanner ler = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Product> products = new ArrayList<>();

		System.out.println("Enter the number of products: ");
		int n = ler.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Product #" + i + " data: ");
			System.out.println("Common, used or imported (c/u/i)?: ");
			char cnh = ler.next().charAt(0);

			System.out.println("Name: ");
			ler.nextLine();
			String name = ler.nextLine();
			System.out.println("Price: ");
			double price = ler.nextDouble();

			if (cnh == 'c') {
				products.add(new Product(name, price));
			}
			if (cnh == 'u') {
				System.out.println("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(ler.next());
				products.add(new UsedProduct(name, price, date));
			}
			if (cnh == 'i') {
				System.out.println("Customs fee:");
				double fee = ler.nextDouble();
				products.add(new ImportedProduct(name, price, fee));
			}
		}
		for (Product product : products) {
			System.out.println(product.PriceTag());
		}
		ler.close();
	}
}

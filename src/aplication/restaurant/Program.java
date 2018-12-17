package aplication.restaurant;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner ler = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter cliente data:");
		System.out.println("Name: ");
		String nomeClient = ler.nextLine();
		System.out.println("Email: ");
		String emailClient = ler.nextLine();
		System.out.println("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(ler.next());

		Client client = new Client(nomeClient, emailClient, birthDate);

		System.out.println("Enter order data: ");
		System.out.println("Status: ");
		OrderStatus status = OrderStatus.valueOf(ler.next());
		Order order = new Order(new Date(), status, client);
		
		System.out.println("How many items to this order? ");
		int cont = ler.nextInt();

		for (int i = 1; i <= cont; i++) {
			System.out.println("Enter #" + i + "item data:");
			System.out.println("Product name: ");
			ler.nextLine();
			String nomeProduct = ler.nextLine();
			System.out.println("Product price: ");
			double priceProduct = ler.nextDouble();
			System.out.println("Quantity: ");
			int quantityProduct = ler.nextInt();

			Product product = new Product(nomeProduct, priceProduct);

			OrderItem orderItem = new OrderItem(quantityProduct, priceProduct, product);
			order.additem(orderItem);
		}
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		// System.out.println(client.toString());
		ler.close();
	}
}

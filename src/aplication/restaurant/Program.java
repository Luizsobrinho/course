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
		String orderStatus = ler.nextLine();
		ler.next();
		System.out.println("How many items to this order? ");
		int cont = ler.nextInt();
		
		for (int i = 1; i <= cont; i++) {
			System.out.println("Enter #"+ i +"item data:");
		}
		System.out.println(client.toString());
		ler.close();
	}
}

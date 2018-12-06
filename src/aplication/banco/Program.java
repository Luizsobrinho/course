package aplication.banco;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Banco banco;

		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o numero da conta! ");
		int conta = ler.nextInt();
		System.out.println("Informe o nome do Titular da conta! ");
		ler.nextLine();
		String nome = ler.nextLine();
		System.out.println("Gostaria de inserir um deposito inicial y/n ?");
		char resposta = ler.next().charAt(0);

		if (resposta == 'y') {
			System.out.println("Informe o valor a ser depositado! ");
			double depositoinicial = ler.nextDouble();
			banco = new Banco(conta, nome, depositoinicial);
		} else {
			banco = new Banco(conta, nome);
		}

		System.out.println(banco.toString());
		ler.close();

	}

}

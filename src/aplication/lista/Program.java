package aplication.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("Inform quantos Empregados serão cadastrados! ");

		List<Empregado> empregados = new ArrayList<>();
		int n = ler.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ": ");
			System.out.print("Id: ");
			System.out.println("Informe o Id do funcionario! ");
			int id = ler.nextInt();
			ler.nextLine();
			System.out.println("Informe o nome do funcionario! ");
			String nome = ler.nextLine();
			System.out.println("Informe o salario do funcionario! ");
			double salario = ler.nextDouble();
			
			empregados.add(new Empregado(id, nome, salario));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = ler.nextInt();
		Empregado emp = empregados.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = ler.nextDouble();
			emp.increaseSalary(percentage);
		}
		for (Empregado empregado : empregados) {
			System.out.println(empregado.toString());
		}
		ler.close();
	}
}

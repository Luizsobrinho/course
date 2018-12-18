package aplication.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("Enter the number of employees: ");
		int n = ler.nextInt();

		List<Employee> employees = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + "data: ");
			System.out.println("Outsourced (y/n)?");
			char ch = ler.next().charAt(0);
			System.out.println("Name: ");
			ler.nextLine();
			String nameEmployee = ler.nextLine();
			System.out.println("Hours: ");
			int hoursEmployee = ler.nextInt();
			System.out.println("Value per hour: ");
			int valueporhours = ler.nextInt();

			if (ch == 'y') {
				System.out.println("Additional charge:");
				double additionalcharge = ler.nextDouble();

				Employee employee = new OutsourceEmployee(nameEmployee, hoursEmployee, valueporhours, additionalcharge);
				employees.add(employee);
			} else {
				Employee employee = new Employee(nameEmployee, hoursEmployee, valueporhours);
				employees.add(employee);
			}
		}

		for (Employee employee : employees) {
			System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
		}
		ler.close();
	}

}

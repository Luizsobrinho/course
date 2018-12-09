package aplication.worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner read = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Enter department's name:");
		String departmentName = read.nextLine();

		System.out.println("Enter Worker data: ");
		System.out.println("Name: ");
		String workerName = read.nextLine();
		System.out.println("Level: ");
		String workerLevel = read.nextLine();
		System.out.println("Base Salary: ");
		double workerSalary = read.nextDouble();

		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerSalary,
				new Department(departmentName));

		System.out.println("How many contracts to this worke ? ");
		int count = read.nextInt();

		for (int i = 1; i <= count; i++) {
			System.out.println("Enter contract #" + i + "data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(read.next());
			System.out.println("Value per hour: ");
			double valuePerHour = read.nextDouble();
			System.out.println("Duration: ");
			int hours = read.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println("Enter month and year to calculate income (MM/YYYY): ");
		String data = read.next();
		int mes = Integer.parseInt(data.substring(0, 2));
		int ano = Integer.parseInt(data.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for: " + data + ":" + String.format("%.2f",worker.income(mes, ano)));
		read.close();
	}
}

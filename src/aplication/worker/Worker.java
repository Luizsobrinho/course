package aplication.worker;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

	private String name;
	private WorkerLevel level;
	private double baseSalary;

	// Associação (Composição de Objetos)
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();;

	public Worker() {

	}

	public Worker(String name, WorkerLevel level, double baseSalary) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
	}

	public Worker(String name, WorkerLevel level, double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public void addContract(HourContract contract) {
		this.contracts.add(contract);
	}

	public void removerContract(HourContract contract) {
		this.contracts.remove(contract);
	}

	public double income(int year, int month) {
		double soma = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HourContract con : contracts) {
			cal.setTime(con.getDate());
			int con_year = cal.get(Calendar.YEAR);
			int con_month = 1 + cal.get(Calendar.MONTH);

			if (con_year == year && con_month == month) {
				soma += con.totalValue();
			}
		}
		return soma;
	}

	public String getName() {
		return name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", level=" + level + ", baseSalary=" + baseSalary + ", department=" + department
				+ ", contracts=" + contracts + "]";
	}

}

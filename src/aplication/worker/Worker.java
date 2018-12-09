package aplication.worker;

public class Worker {

	private String name;
	private WorkerLevel level;
	private double baseSalary;

	public Worker() {

	}

	public Worker(String name, WorkerLevel level, double baseSalary) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
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

}

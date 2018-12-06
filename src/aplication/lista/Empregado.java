package aplication.lista;

public class Empregado {

	private int id;
	private String nome;
	private double salario;

	public Empregado() {

	}

	public Empregado(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	@Override
	public String toString() {
		return "Empregado [id=" + id + ", nome=" + nome + ", salario=" + salario + "]";
	}

	public void increaseSalary(double percentage) {
		this.salario = 00;
		
	}

}

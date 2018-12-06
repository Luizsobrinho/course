package aplication.funcionario;

public class Funcionario {

	private String nome;
	private double salario;
	private double taxa;

	public Funcionario() {

	}

	public Funcionario(String nome, double salario, float taxa) {
		this.nome = nome;
		this.salario = salario;
		this.taxa = taxa;
	}

	public double salarioLiquido() {
		double porcento = this.taxa / 100;
		return this.salario -=  (this.salario * porcento);
	}

	public void aumentarSalario(double porcentagem) {
		double por = porcentagem / 100;
		System.out.println(this.salario);
		this.salario += this.salario * por;
		System.out.println(this.salario);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

}

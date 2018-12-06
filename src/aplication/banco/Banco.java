package aplication.banco;

public class Banco {

	private int numeroconta;
	private String titular;
	private double saldo;

	public Banco() {

	}

	public Banco(int numeroconta, String titular, double depositoinicial) {
		this.numeroconta = numeroconta;
		this.titular = titular;
		this.depositar(depositoinicial);
	}

	public Banco(int numeroconta, String titular) {
		this.numeroconta = numeroconta;
		this.titular = titular;

	}

	public void depositar(double deposito) {
		this.saldo += deposito;
	}

	public void sacar(double saque) {
		this.saldo = (this.saldo - 5.00) - saque;
	}

	public int getNumeroconta() {
		return numeroconta;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Banco [numeroconta=" + numeroconta + ", titular=" + titular + ", saldo=" + saldo + "]";
	}

}

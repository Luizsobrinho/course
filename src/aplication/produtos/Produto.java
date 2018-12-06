package aplication.produtos;

public class Produto {

	private String nome;
	private double preco;
	private int quantidade;

	public Produto() {

	}

	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public double totalValueInStock() {
		return this.preco * this.quantidade;

	}

	public void addProducts(int quantity) {
		this.quantidade += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantidade -= quantity;
	}

	@Override
	public String toString() {

		return "Produto [nome: " + this.nome + " - preco: " + this.preco + " - quantidade: " + this.quantidade
				+ " - total: " + this.totalValueInStock() + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}

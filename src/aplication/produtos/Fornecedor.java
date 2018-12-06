package aplication.produtos;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor {

	private String nome;
	private String cnpj;
	private List<Produto> produtos = new ArrayList<>();

	public void adicionar(Fornecedor forncedor) {
		List<Fornecedor> forne = new ArrayList<>();
		forne.add(forncedor);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}

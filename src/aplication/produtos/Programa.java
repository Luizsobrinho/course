package aplication.produtos;
import java.util.Scanner;
public class Programa {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Produto produto = new Produto();
		
		System.out.println("Coloque as informações do Produto");
		System.out.println("Nome do Produto: ");
		produto.setNome(ler.nextLine());
		System.out.println("Preco do Produto: ");
		produto.setPreco(ler.nextDouble());
		System.out.println("Quantidade do Produto: ");
		produto.setQuantidade(ler.nextInt());
		
		System.out.println(produto.toString());
		
		System.out.println("Infome a quantidade a ser adicionada no Estoque: ");
		produto.addProducts(ler.nextInt());
		produto.totalValueInStock();
		System.out.println(produto.toString());
		
		System.out.println("Infome a quantidade a ser removida do esotuqe no Estoque: ");
		produto.removeProducts(ler.nextInt());
		produto.totalValueInStock();
		System.out.println(produto.toString());
		ler.close();
		
		
	}

}

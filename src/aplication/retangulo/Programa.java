package aplication.retangulo;

public class Programa {

	public static void main(String[] args) {
		
		Retangulo retangulo = new Retangulo(5, 10);
		System.out.println(retangulo.calcularArea());
		System.out.println(retangulo.calcularPerimetro());
		System.out.println(retangulo.calcularDiagonal());
		
		System.out.println(retangulo.toString());
	}

}

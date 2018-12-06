package aplication;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();

		System.out.println("Informe os 3 valores do Triangulo X!: ");
		x.setA(ler.nextDouble());
		x.setB(ler.nextDouble());
		x.setC(ler.nextDouble());

		System.out.println("Informe os 3 valores do Triangulo Y!:");
		y.setA(ler.nextDouble());
		y.setB(ler.nextDouble());
		y.setC(ler.nextDouble());
		
		double areaX = x.calcularArea();
		double areaY = y.calcularArea();

		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}

		ler.close();

	}

}

package aplication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double xA, xB, xC;
		double yA, yB, yC;

		System.out.println("Informe os 3 valores do Triangulo X!: ");
		xA = ler.nextDouble();
		xB = ler.nextDouble();
		xC = ler.nextDouble();

		System.out.println("Informe os 3 valores do Triangulo Y!:");
		yA = ler.nextDouble();
		yB = ler.nextDouble();
		yC = ler.nextDouble();

		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

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

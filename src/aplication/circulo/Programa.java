package aplication.circulo;

import java.util.Scanner;

public class Programa {

	public static final double PI = 3.14159;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o valor do raio! ");
		double raio = ler.nextDouble();
		double c = calcularCircuferencia(raio);
		double v = calcularVolume(raio);
		System.out.println(c);
		System.out.println(v);
		System.out.println("PI:" + PI);
		ler.close();

	}

	static double calcularCircuferencia(double raio) {
		return 2.0 * PI * raio;
	}
	
	static double calcularVolume(double raio) {
		return (4.0 * PI * Math.pow(raio, 3)) / 3;
	}
}

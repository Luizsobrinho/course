package aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {

		method1();
		System.out.println("End of program");

	}

	public static void method1() {
		System.out.println("------ Method1 start ------");
		method2();
		System.out.println("------ Method1 end ------");
	}

	public static void method2() {
		System.out.println("------ Method2 start ------");
		Scanner ler = new Scanner(System.in);
		try {
			String[] vect = ler.nextLine().split(" ");
			int position = ler.nextInt();
			System.out.println(vect[position]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();
			ler.next();
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		ler.close();
		System.out.println("------ Method2 end ------");
	}
}

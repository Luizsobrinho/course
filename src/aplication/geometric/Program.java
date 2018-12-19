package aplication.geometric;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Enter the number of shapes:");
		int n = ler.nextInt();
		List<Shape> shapes = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + "data:");
			System.out.println("Rectangle or Circle (r/c)? ");
			char chn = ler.next().charAt(0);
			System.out.println("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(ler.next());

			if (chn == 'r') {
				System.out.println("Width: ");
				double width = ler.nextDouble();
				System.out.println("Height: ");
				double height = ler.nextDouble();
				Rectangle rectangle = new Rectangle(color, height, width);
				shapes.add(rectangle);

			} else {
				System.out.println("Radius:");
				double radius = ler.nextDouble();
				Circle circle = new Circle(color, radius);
				shapes.add(circle);

			}
		}

		for (Shape shape : shapes) {
			System.out.println(shape.area());
		}

		ler.close();
	}
}

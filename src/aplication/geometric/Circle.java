package aplication.geometric;

public class Circle extends Shape {

	public static final double PI = 3.14159;
	private double radius;

	public Circle() {
	}

	public Circle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double area() {

		return PI * Math.pow(radius, 2);

	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}

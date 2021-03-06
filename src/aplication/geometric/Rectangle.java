package aplication.geometric;

public class Rectangle extends Shape {

	private double height;
	private double width;

	public Rectangle() {

	}

	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	public Rectangle(Color color, double height, double width) {
		super(color);
		this.height = height;
		this.width = width;
	}

	@Override
	public double area() {

		return width * height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

}

package aplication.retangulo;

public class Retangulo {

	private double altura;
	private double largura;

	public Retangulo() {

	}

	public Retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}

	public double calcularArea() {
		return this.largura * this.altura;
	}

	public double calcularPerimetro() {
		double P = 2 * (this.largura + this.altura);
		return P;
	}

	public double calcularDiagonal() {
		double diagonal;
		diagonal = Math.pow(this.largura, 2) + Math.pow(this.altura, 2);
		return Math.sqrt(diagonal);
	}

	@Override
	public String toString() {

		return "Produto [Largura: " + this.largura + " - Altura: " + this.altura + " - Area: " + this.calcularArea()
				+ " - Perimetro: " + this.calcularPerimetro() + " - Diagonal: " + this.calcularDiagonal() + "]";
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

}

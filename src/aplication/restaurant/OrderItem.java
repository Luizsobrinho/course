package aplication.restaurant;

public class OrderItem {

	private Integer quantity;
	private double price;

	public OrderItem() {

	}

	public double subTotal() {
		return price * quantity;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

package aplication.restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

	private Date moment;
	private OrderStatus status;

	List<OrderItem> orderitems = new ArrayList<>();

	public Order() {

	}

	public Order(Date moment, OrderStatus status) {

		this.moment = moment;
		this.status = status;
	}

	public void additem(OrderItem item) {
		orderitems.add(item);
	}

	public void removeitem(OrderItem item) {
		orderitems.remove(item);
	}

	public double total() {
		double sum = 0;
		for (OrderItem orderItem : orderitems) {
			sum += orderItem.getPrice();
		}
		return sum;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getOrderitems() {
		return orderitems;
	}
}

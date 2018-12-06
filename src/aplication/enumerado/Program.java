package aplication.enumerado;

import java.util.Date;
import entites.enums.Order;
import entites.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		System.out.println(order.toString());
	}
}

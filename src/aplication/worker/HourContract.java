package aplication.worker;

import java.util.Date;

public class HourContract {

	private Date date;
	private double valuePerHour;
	private int hours;

	public HourContract() {

	}

	public double totalValue() {
		return 0;
	}

	public Date getDate() {
		return date;
	}

	public double getValuePerHour() {
		return valuePerHour;
	}

	public int getHours() {
		return hours;
	}
}

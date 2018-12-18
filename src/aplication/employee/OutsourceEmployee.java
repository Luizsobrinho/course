package aplication.employee;

public class OutsourceEmployee extends Employee {

	private double additionalCharge;

	public OutsourceEmployee() {

	}

	public OutsourceEmployee(String name, Integer hours, double valuePerHour, double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	@Override
	public double payment() {

		return super.payment() + additionalCharge * 1.1;

	}

	public double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

}

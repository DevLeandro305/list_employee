package entities;

public class OutsourcedEmployee extends Employee {

	private Double aditionalCharge;

	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hour, Double valuePerHour, Double aditionalCharge) {
		super(name, hour, valuePerHour);
		this.aditionalCharge = aditionalCharge;
	}

	public Double getAditionalCharge() {
		return aditionalCharge;
	}

	public void setAditionalCharge(Double aditionalCharge) {
		this.aditionalCharge = aditionalCharge;
	}

	@Override
	public Double payment() {
		double sum;
		
		sum = hour * valuePerHour + (aditionalCharge * 1.1);
		
		return sum;
		
		//return super.payment() + aditionalCharge * 1.1;     com essa formula não precisa da variável "private" na superclasse Employee e nem de variável sum.
	}

}

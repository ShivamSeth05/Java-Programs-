package dec14;

public class Employee {
	String name;
	int id;
	int workhrr;
	double basePay;

	public Employee(String name, int id, int workhrr, double basePay) {
		this.name = name;
		this.id = id;
		this.workhrr = workhrr;
		this.basePay = basePay;
	}

	public Employee() {
		name = null;
		id = 0;
		workhrr = 0;
		basePay = 0.0;
	}
	
	
	

}

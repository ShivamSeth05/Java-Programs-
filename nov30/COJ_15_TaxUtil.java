/*
 * Public Methods:
calculateTax(COJ_15_Employee) - returns a double
calculateTax(COJ_15_Manager) - returns a double
calculateTax(COJ_15_Trainer) - returns a double
calculateTax(COJ_15_Sourcing) - returns a double

Tax Calculation Logic: If gross salary is greater than 30000 tax is 20% else, tax is 5%

Note : All the fields of above classes must be declared as non-private.

A COJ_15_Constructor class is given to you with the main Method. Use this class to test your solution.

 */

package nov30;

public class COJ_15_TaxUtil {
	public double calculateEmployeeTax() {
		COJ_15_Employee ob = new COJ_15_Employee(1,"Shivam", 100000, 1000, 5000);
		double rs=ob.calculateGrossSalary();
		if( rs>30000)rs=rs-rs*0.20;
		else rs=rs-rs*0.5;
		return rs;
	}
	public double calculateManagerTax() {
		COJ_15_Manager ob1 = new COJ_15_Manager(01, "Vishal", 15000, 1500, 2000, 20000);
		double rs=ob1.calculateGrossSalary();
		if( rs>30000)rs=rs-rs*0.20;
		else rs=rs-rs*0.5;
		return rs;
	}
	public double calculateTrainerTax() {
		COJ_15_Trainer ob2 = new COJ_15_Trainer(01, 11, "IT", 1520, 2520, 5220, 250);
		double rs=ob2.calculateGrossSalary();
		if( rs>30000)rs=rs-rs*0.20;
		else rs=rs-rs*0.5;
		return rs;
	}
	public double calculateSourcingTax() {
		COJ_15_Sourcing ob3 = new COJ_15_Sourcing(01, 15, 12, "ORCLE", 10050, 1201, 52200, 5220);
		double rs=ob3.calculateGrossSalary();
		if( rs>30000)rs=rs-rs*0.20;
		else rs=rs-rs*0.5;
		return rs;
	}
		

	


}

//Class COJ_15_Employee
//Fields: id: int, name : String, basicSalary : double, HRAPer : double,DAPer : double
//Public Method: calculateGrossSalary() - returns a double
//Calculate the gross salary as : basicSalary +HRAPer +DAPer
//Constructors:
//default constructor: This constructor should initialize the instance variables with 
//the proper default values
//parameter constructor: Create with fields in the Order: 
//( int id, String name, double basicSalary, double HRAPer, double DAPer)

package nov30;

public class COJ_15_Employee {
	int id ;
	String name; 
	double basicSalary,hRAPer,dAPer;
	
	public COJ_15_Employee() {
		super();
		id =0;
		name = null;
		basicSalary = 0;
		hRAPer = 0;
		dAPer = 0;
	}
	
	
	public COJ_15_Employee(int id, String name, double basicSalary, double hRAPer, double dAPer) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.hRAPer = hRAPer;
		this.dAPer = dAPer;
	}
	
	double calculateGrossSalary(){
		return basicSalary+hRAPer+dAPer;
	}

}

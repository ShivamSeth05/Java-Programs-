/*
 * 
Class COJ_15_Manager
Fields: id: int, name : String, basicSalary : double, HRAPer : double,DAPer : double, projectAllowance: double
Public Method: calculateGrossSalary() - returns a double
Calculate the gross salary as : basicSalary +HRAPer +DAPer + projectAllowance

Constructors:
default constructor: This constructor should initialize the instance variables with the proper default values
parameter constructor: Create with fields in the Order: 
( int id, String name, double basicSalary, double HRAPer, double DAPer, double projectAllowance)

 */

package nov30;

public class COJ_15_Manager {
	 int id;
	 String name;
	double basicSalary, hRAPer ,dAPer , projectAllowance;
	 
	public COJ_15_Manager() {
			super();
			this.id = 0;
			this.name = null;
			this.basicSalary = 0.0;
			this.hRAPer = 0.0;
			this.dAPer = 0.0;
			this.projectAllowance = 0.0;
		}
	 
	public COJ_15_Manager(int id, String name, double basicSalary, double hRAPer, double dAPer,
			double projectAllowance) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.hRAPer = hRAPer;
		this.dAPer = dAPer;
		this.projectAllowance = projectAllowance;
	}
	
	double calculateGrossSalary(){
		return basicSalary +hRAPer +dAPer + projectAllowance;		
	}
	 

}

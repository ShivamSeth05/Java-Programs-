/*
 * Class COJ_15_Sourcing
Fields: id: int, name : String, basicSalary : double, HRAPer : double,DAPer : double, enrollmentTarget: int, enrollmentReached: int, perkPerEnrollment: double
Public Method: calculateGrossSalary() - returns a double
Calculate the gross salary as : basicSalary +HRAPer +DAPer +((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment)

Constructors:
default constructor: This constructor should initialize the instance variables with the proper default values
parameter constructor: with fields in the Order: ( int id, String name, double basicSalary, double HRAPer, double DAPer, int enrollmentTarget, int enrollmentReached, double perkPerEnrollment)
Class COJ_15_Sourcing
Fields: id: int, name : String, basicSalary : double, HRAPer : double,DAPer : double, enrollmentTarget: int, enrollmentReached: int, perkPerEnrollment: double
Public Method: calculateGrossSalary() - returns a double
Calculate the gross salary as : basicSalary +HRAPer +DAPer +((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment)

Constructors:
default constructor: This constructor should initialize the instance variables with the proper default values
parameter constructor: with fields in the Order: ( int id, String name, double basicSalary, double HRAPer, double DAPer, int enrollmentTarget, int enrollmentReached, double perkPerEnrollment)

 */


package nov30;

public class COJ_15_Sourcing {
	int id,enrollmentTarget,enrollmentReached;
	String name;
	double basicSalary , hRAPer,dAPer ,perkPerEnrollment;
	
	public COJ_15_Sourcing() {
		super();
		this.id = 0;
		this.enrollmentTarget = 0;
		this.enrollmentReached = 0;
		this.name = null;
		this.basicSalary = 0.0;
		this.hRAPer = 0.0;
		this.dAPer = 0.0;
		this.perkPerEnrollment = 0.0;
	}
	
	public COJ_15_Sourcing(int id, int enrollmentTarget, int enrollmentReached, String nameString, double basicSalary,
			double hRAPer, double dAPer, double perkPerEnrollment) {
		super();
		this.id = id;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.name = nameString;
		this.basicSalary = basicSalary;
		this.hRAPer = hRAPer;
		this.dAPer = dAPer;
		this.perkPerEnrollment = perkPerEnrollment;
	}

	double calculateGrossSalary(){
		return basicSalary +hRAPer +dAPer +((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment;
	}
	

}

/*
 * Class COJ_15_Trainer
Fields: id: int, name :
 String, basicSalary : double, HRAPer : double,DAPer : double, batchCount: int, perkPerBatch: double
Public Method: calculateGrossSalary() - returns a double
Calculate the gross salary as : basicSalary +HRAPer +DAPer +(batchCount * perkPerBatch)

Constructors:
default constructor: This constructor should initialize the instance variables with the proper default values
parameter constructor: Create with fields in the Order:
 ( int id, String name, double basicSalary, double HRAPer, double DAPer, int batchCount,double perkPerBatch)

 */

package nov30;

public class COJ_15_Trainer {
	int id,batchCount;
	String name ;
	double basicSalary ,hRAPer,dAPer ,perkPerBatch;

	public COJ_15_Trainer() {
		super();
		this.id =0;
		this.batchCount = 0;
		this.name = null;
		this.basicSalary = 0.0;
		hRAPer = 0.0;
		dAPer = 0.0;
		this.perkPerBatch = 0.0;
	}
	
	
	public COJ_15_Trainer(int id, int batchCount, String name, double basicSalary, double hRAPer, double dAPer,
			double perkPerBatch) {
		super();
		this.id = id;
		this.batchCount = batchCount;
		this.name = name;
		this.basicSalary = basicSalary;
		this.hRAPer = hRAPer;
		this.dAPer = dAPer;
		this.perkPerBatch = perkPerBatch;
	}



	double calculateGrossSalary(){
		return basicSalary +hRAPer +dAPer +(batchCount * perkPerBatch);
		
	}


}

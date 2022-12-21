/*
 * 2. Create a class Nareshit having :
a. Fields Batch Name, total Trainees, Batch Technology, current status of batch.
b. Assign them values while creating them.
c. Create main method and print values of all the above fields.
d. Then try the same example by using method to set the values and to get the values.
e. In the above example don’t assign any values to the field and print 
   the values in the main method. What values you will get?

 */
package nov29;
class Nareshit{
	String batchName,totalTrainees, batchTechnology, currentstatusofbatch;
	
	Nareshit(){
		
	}

	 Nareshit(String batchName, String totalTrainees, String batchTechnology, String currentstatusofbatch) {
		this.batchName = batchName;
		this.totalTrainees = totalTrainees;
		this.batchTechnology = batchTechnology;
		this.currentstatusofbatch = currentstatusofbatch;
	}
	void display() {
		System.out.println(batchName);
		System.out.println(totalTrainees);
		System.out.println(batchTechnology);
		System.out.println(currentstatusofbatch);
	}
	
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public String getTotalTrainees() {
		return totalTrainees;
	}
	public void setTotalTrainees(String totalTrainees) {
		this.totalTrainees = totalTrainees;
	}
	public String getBatchTechnology() {
		return batchTechnology;
	}
	public void setBatchTechnology(String batchTechnology) {
		this.batchTechnology = batchTechnology;
	}
	public String getCurrentstatusofbatch() {
		return currentstatusofbatch;
	}
	public void setCurrentstatusofbatch(String currentstatusofbatch) {
		this.currentstatusofbatch = currentstatusofbatch;
	}
}
public class SecondNareshit {

	public static void main(String[] args) {
		Nareshit ob = new Nareshit("Batch11", "15", "JAVA", "OFF");
		ob.display();
		Nareshit ob1 = new Nareshit();
		ob1.setBatchName("Raj");
		ob1.setBatchTechnology("25");
		ob.setCurrentstatusofbatch("C");
		ob.setTotalTrainees("ON Going");
		System.out.println(ob.getBatchName());
//		System.out.println(ob.getBatchTechnology());
		String ct=ob.getCurrentstatusofbatch();
		System.out.println(ct);
//		ob.getCurrentstatusofbatch();
		
		
	}

}

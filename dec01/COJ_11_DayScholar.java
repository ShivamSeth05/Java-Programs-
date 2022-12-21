package dec01;

public class COJ_11_DayScholar extends COJ_11_Student {
	double transportFee;

	public COJ_11_DayScholar() {
		transportFee = 0.0;
	}
	
	public COJ_11_DayScholar(int studentId, String name, double examFee,double transportFee) {
		super(studentId,name,examFee);
		this.transportFee = transportFee;
	}
	
	
	public String displayDetails(){
		return "DayScholar[transportFee=" + transportFee + ", name=" + name + ", studentId=" + examFee + "]";		
		}


}

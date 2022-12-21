package dec01;

public class COJ_11_Hosteller extends COJ_11_Student {

	double hostelFee ;

	public COJ_11_Hosteller() {
		hostelFee = 0.0;
	}
	
	public COJ_11_Hosteller(int studentId,String name,double examFee,double hostelFee) {
		super(studentId,name,examFee);
		this.hostelFee = hostelFee;
	}
	
	public String displayDetails(){
		return "COJ_11_Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";	
	}
	

}

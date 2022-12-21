package dec01;

public class COJ_11_Student {
	int studentId;  
	String name;
	double examFee;
	
	public COJ_11_Student() {
		this.studentId = 0;
		this.name = null;
		this.examFee = 0.0;
	}
	
	public COJ_11_Student(int studentId, String name, double examFee) {
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
	}
	public String displayDetails(){
		return "COJ_11_Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
	}
	public double payFee() {
		
		return examFee;
		
	}

	@Override
	public String toString() {
		return "COJ_11_Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
	}
	
	
}

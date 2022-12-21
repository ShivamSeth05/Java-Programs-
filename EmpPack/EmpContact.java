package EmpPack;

public class EmpContact {
	String mailId;
	double phoneNo;
	public EmpContact(String mailId, double phoneNo) {
		this.mailId = mailId;
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "EmpContact [mailId=" + mailId + ", phoneNo=" + phoneNo + "]";
	}

}

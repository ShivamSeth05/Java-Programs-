package EmpPack;

public class EmpAddress {
	@Override
	public String toString() {
		return "EmpAddress [hNO=" + hNO + ", sName=" + sName + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
	String hNO,sName,city;
	int pinCode;
	public EmpAddress(String hNO, String sName, String city, int pinCode) {
		this.hNO = hNO;
		this.sName = sName;
		this.city = city;
		this.pinCode = pinCode;
	}

}

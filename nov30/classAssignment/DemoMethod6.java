package classAssignment;


class CustomersDetails{
	 int id;
	 String name;
	CustomersDetails(int id,String name){
	this.id = id;
	this.name = name;
	}
	 void getCoutomersDetailss() {
		System.out.println(id);
		System.out.println(name);
	}
	 
}
class CustomersAddress{
	int hNO;
	String sName,city,pinCode;
	CustomersAddress(int hNo,String sName,String city,String pinCode){
		this.hNO=hNo;
		this.sName=sName;
		this.city=city;
		this.pinCode=pinCode;	
	}
	void getCostomerAddress(){
		System.out.println(hNO);
		System.out.println(sName);
		System.out.println(city);
		System.out.println(pinCode);
	}
}
class CustomersContact{
	String mail;
	long phn;
	CustomersContact(String mail ,long phn){
		this.mail = mail;
		this.phn=phn;
	}
	
	 void getCostomerContact() {
		 System.out.println(mail);
		 System.out.println(phn);

	}
}
public class DemoMethod6 {

	public static void main(String[] args) {
		CustomersDetails ob1 = new CustomersDetails(101,"shih");
		ob1.getCoutomersDetailss();
		System.out.println("=============================");
		CustomersAddress ob2 =new CustomersAddress(01,"shivam","vns","221001");
		ob2.getCostomerAddress();//
		System.out.println("======================");
		CustomersContact ob3 = new CustomersContact("seth123@gmail.com",252525552);
		ob3.getCostomerContact();

	}

}

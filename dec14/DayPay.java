package dec14;

public class DayPay {
	private static double calculateSalary(Employee ob){
		if(ob.workhrr>60)return -1;
		if(ob.basePay<8*70)return 0;
		
		if(ob.workhrr<=40)return ob.workhrr*ob.basePay;
		return ob.basePay*40 + (ob.workhrr-40)*ob.basePay*1.5;
	
	}
	public static String displayEmployeeDetails(Employee ob){
		double pay= calculateSalary(ob);
//		System.out.println(pay);
		return "Employee [Name: "+ob.name+" id: "+ob.id+" Base Pay:"+ob.basePay+", No. of hours worked: "+ob.workhrr+", Payed: "+pay+"]";
		
	}
	
}

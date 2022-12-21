package EmpPack;

import java.util.Scanner;


public class DataWriter {
	StringBuffer sb[] =null;//in
	public DataWriter(StringBuffer sb[]) {
		this.sb = sb;
	}
	public void write(Scanner sc) {
		
		
		for(int i = 0; i < sb.length; i++) {
			
				System.out.println("Enter emp Details");
				String empId,empName,empDesg;
				System.out.println("Enter emp ID");
				empId=sc.nextLine();     
				System.out.println("Enter emp name");
				empName=sc.nextLine();
				System.out.println("Enter emp DESG");
				empDesg=sc.nextLine();
				
				EmpDetails ed =new EmpDetails(empId, empName, empDesg);
				sb[i].append("gdg");
				System.out.println(sb[i]);
				
				
	
				System.out.println("Enter emp Addrres");
				String hNO,sName,city;
				int pinCode;
				System.out.println("Enter emp House no");
				hNO=sc.nextLine();
				System.out.println("Enter emp Street name");
				sName=sc.nextLine();
				System.out.println("Enter emp City");
				city=sc.nextLine();
				pinCode=Integer.parseInt(sc.nextLine());
				EmpAddress ea = new EmpAddress(hNO, sName, city, pinCode);
				sb[i].append(ea);
				
				System.out.println("Enter emp Contact");
				
				String mailId;
				double phoneNo;
				System.out.println("Enter emp maiil Id");
				mailId=sc.nextLine();
				System.out.println("Enter emp Phone");
				phoneNo=sc.nextDouble();
				EmpContact ec = new EmpContact(mailId, phoneNo);
				sb[i].append(ec);
				
		}
	}
	
	
	
	

}

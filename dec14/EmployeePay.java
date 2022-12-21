package dec14;

import java.util.Scanner;

public class EmployeePay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name:");
		String name=sc.nextLine();
		System.out.println("Enter the id:");
		int id = sc.nextInt();
		System.out.println("Enter the workhrr:");
		int workhrr=sc.nextInt();
		System.out.println("Enter the basePay:");
		double basePay=sc.nextDouble();
		
		Employee ob = new Employee(name,id,workhrr,basePay);
		System.out.println(DayPay.displayEmployeeDetails(ob));
		
	}

}

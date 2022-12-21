package EmpPack;

import java.util.Scanner;

public class DemoRefr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Emp");
		int n = Integer.parseInt(sc.nextLine());
		
		StringBuffer sb[] = new StringBuffer[n];
		
		
		DataWriter dw = new DataWriter(sb);
		DataReader dr = new DataReader(sb);
		dw.write(sc);
		dr.read();
		
		sc.close();
	}

}

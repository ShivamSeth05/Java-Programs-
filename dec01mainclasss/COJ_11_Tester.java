package dec01mainclasss;
import java.util.Scanner;

import dec01.*;
public class COJ_11_Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student ID");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Student name");
		String name=sc.nextLine();
		System.out.println("Enter Student EXAM FEE");
		double efee=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Student Hostel Fee");
		double hfee=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Student transportFee");
		double tfee=Integer.parseInt(sc.nextLine());
		
		COJ_11_Hosteller ob2 =  new COJ_11_Hosteller(id, name,efee,hfee);
		COJ_11_DayScholar ob1 = new COJ_11_DayScholar(id, name, efee, tfee);
		
		System.out.println(ob1.displayDetails());
		System.out.println(ob2.displayDetails());
		sc.close();
	}

}

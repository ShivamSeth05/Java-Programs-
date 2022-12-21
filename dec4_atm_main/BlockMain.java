package dec4_atm_main;

import java.util.Scanner;

import dec4_atm.*;

public class BlockMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c=3;
		boolean t=false;
		while(c!=0) {
			c--;
			System.out.println("Enter pin No");
			int pin=sc.nextInt();//1111
			String cString=Integer.toString(pin);
			if(cString.length()==4) {
				CheckPinNo ck = new CheckPinNo(pin);
				if(ck.verify()) {
					c=0; t=true;

					System.out.println("1. Withdraw");
					System.out.println("2. Deposit");
					System.out.println("Enter Choice");
					int ch=sc.nextInt();
					switch (ch) {
					case 1 ->{
						Withdraw ob = new Withdraw();
						System.out.println("Enter the Amount");
						int amt=sc.nextInt();
						if(amt>0&& amt%100==0) {
							ob.proces(amt);
						}else System.out.println("Invalid Amount!!");
					}
					case 2 ->{
						System.out.println("Enter the Amount");
						int amt=sc.nextInt();
						if(amt>0&& amt%100==0) {
							Deposit ob = new Deposit();
							ob.proces(amt);
						}else System.out.println("Invalid Amount !!!");
					}
					default ->System.out.println("Inalid choice");
					}
				}else System.out.println("Invalid Pin Try again !!! \n");
			}else System.out.println("Invalid Pin Try again !!! \n");

		}
		if(!t)System.out.println("Transcation Blocked Temporary!!");
		sc.close();
	}

}

package dec23Exception;

import java.util.Scanner;

public class Pro1SimpleExceptionDemo extends Exception {
	public Pro1SimpleExceptionDemo(String msg) {
		super(msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter first num");
			int n1=sc.nextInt();
			System.out.println("Enter Second num");
			int n2=sc.nextInt();
			
//			if(n1<0||n1>9 ||n2<0||n2>9 ) {
//				Pro1SimpleExceptionDemo ob = new Pro1SimpleExceptionDemo("Invald data");
//				throw ob;
//			}
			System.out.println(n1+n2);
			
		} catch (NumberFormatException e) {
			System.out.println("Invalid");
		}
//		catch (Pro1SimpleExceptionDemo ob) {
//			System.out.println(ob.getMessage());
//		}

	}

}

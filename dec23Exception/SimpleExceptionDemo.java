package dec23Exception;

import java.util.Scanner;

public class SimpleExceptionDemo extends Exception {
	public SimpleExceptionDemo(String msg) {
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
			
			if(n1<0||n1>9 ||n2<0||n2>9 ) {
				SimpleExceptionDemo ob = new SimpleExceptionDemo("Invald data");
				throw ob;
			}
			System.out.println(n1+n2);
			
		} catch (NumberFormatException e) {
			System.out.println("Invalid");
		}
		catch (Exception ob) {
			System.out.println(ob.getMessage());
		}

	}

}

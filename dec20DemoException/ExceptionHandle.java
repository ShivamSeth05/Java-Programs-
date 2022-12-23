package dec20DemoException;
import java.util.*;

import java.util.Scanner;

@SuppressWarnings("serial")
public class ExceptionHandle extends Exception{

	public ExceptionHandle(String msg) {// TODO Auto-generated constructor stub
		super(msg);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Enter the bSal:");
			int bSal = s.nextInt();//Exception for
			if(bSal<12000) {
				ExceptionHandle ob = new ExceptionHandle("Invalid Amt");
				throw ob;
			}
			
			float totSal =bSal+(0.93F*bSal)+(0.63F*bSal);
			System.out.println("BSal:"+bSal);
			System.out.println("TotSal:"+totSal);
			
		}catch (InputMismatchException e) {
		System.out.println("Integer Only");	
		}
		
		catch (ExceptionHandle msg) {
			// TODO: handle exception
			System.out.println(msg.getMessage());
		}
		finally {
			s.close();
		}
		
		




	}
}

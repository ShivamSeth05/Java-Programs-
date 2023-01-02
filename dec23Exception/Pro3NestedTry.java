package dec23Exception;

//import java.io.FileInputStream;
import java.io.*;

public class Pro3NestedTry 
{

	public static void main(String[] args){
		try {
			try {
				System.out.println("fd");
				FileInputStream fis = new FileInputStream(new File(args[0]));

			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsException");
			}
			try {
				int num=2;
				int res=num/0;
				System.out.println("The result is"+res);
			} catch(Exception e) {
				System.out.println("Devide By 0 - Airthmatic Exception");
			}
		} catch (Exception e) {
			System.out.println("");
		}
		

	}
}

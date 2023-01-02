///*
// * d. Write a program to create a class ‘UserExceptionDemo’ which implements main method
//where main() method throws IOException and MyException.
//e. Inside main() method create a String variable tempName and initialize with a blank String.
//Write try-catch block inside try block, declare String variable ‘name’ and initialize it with value
//‘nacre’.
//f. Print an appropriate message to get a name from console and after getting the name assign it to
//the tempName variable.
//g. Compare the two variables name and tempName using equals method of java.lang.String class
//and if they are same print “Welcome to NACRE” else write the following code
//throw new MyException("Hi .. "+tempName);
//h. Handle MyException and IOException using catch blocks by printing appropriate user
//friendly messags. In MyException catch block print in the console as following
//System.out.println(e.getMessage()); System.out.println(e);
// ***Where ‘e’ is the object of MyException.
// */
//package dec23Exception;
//
//import java.io.*;
//
//public class UserExceptionDemo extends ProMyException {
//
//	public static void main(String[] args)throws  ProMyException {
//		String tempName="";
//		try {
//			tempName="nacre";
//			
//		} catch (Exception e) {
//			System.out.println("Exception");
//		}
//		try {
//			if (name.equals(tempName)) {
//				
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//
//}

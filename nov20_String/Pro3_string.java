/*
 Program3:Splitting Of String…
a. Write a program to create a class ‘StringOperation’ with a String instance variable ‘strVar’.
b. Create getter and setter methods to assign /retrieve values to this variable.
c. Now create a method for the following String operation.
d. Split the string where a ‘,’ or ‘.’ is present and print the split Strings using enhanced for loop.
e. Create a class ‘MainClass’ to implement main method in which create an object of ‘StringOpearation’
 class and assign appropriate values to the instance variable and perform the operation calling the method.
 */


package nov20_String;

import java.util.Scanner;

class StringOper{
	String strVar="";
	void  setstrVar(String strVar) {
		this.strVar=strVar;
	}
	String getstrVar() {
		return strVar;
	}
	void splitString() {
//		String[] a=strVar.split(",");
		for(String k:strVar.split(","))
			System.out.println(k);
	}
}
public class Pro3_string {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in); 
	//String strVar=sc.nextLine();
	System.out.println("enter a string");
	StringOper so=new StringOper();
	so.setstrVar(sc.nextLine());
	so.splitString();
	sc.close();

	}

}

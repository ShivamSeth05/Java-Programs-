package nov20_String;


import java.util.Scanner;

/*
 * Program4:Replace Content Of String…
a. Write a program to create a class ‘StringOperation’ with a String 
instance variable ‘strVar’.
b. Create getter and setter methods to assign /retrieve values to this 
variable.
c. Now create a method for the following String operation.
d. Remove the Trailing White Spaces from the String 
(Try using replaceAll() method).
e. Create a class ‘MainClass’ to implement main method in which create a 
object of ‘StringOpearation’ Class and assign appropriate values to the 
instance variable and perform the operation calling the method.
 */
class StringOperation1{
	String strVar="";
	void  setstrVar(String strVar) {
		this.strVar=strVar;
	}
	String getstrVar() {
		return strVar;
	}
	void removeWhiteSpace() {
		System.out.println(strVar.replaceAll(" ", ""));
	}
}
	
	public class Pro_4string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//String strVar=sc.nextLine();
		System.out.println("enter a string");
		StringOperation1 so=new StringOperation1();
		so.setstrVar(sc.nextLine());
		so.removeWhiteSpace();
		sc.close();
  
	}

}

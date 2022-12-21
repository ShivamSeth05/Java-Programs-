package nov20_String;
/*
 * 
Program1:Reverse a String…
a. Write a program to create a class ‘StringOperation’ with a String instance variable ‘strVar’.
b. Create getter and setter methods to assign /retrieve values to this variable.
c. Now create individual methods for each of the following String operations.
d. Reverse the String(Try using StringBuffer).
e. Reverse the String(Try not using StringBuffer)
f. Create a class ‘MainClass’ to implement main method in which create an object of ‘StringOpearation’ 
Class and assign appropriate values to the instance variable and perform the operations calling the methods.
 */

class StringOperation{
	String strVar="";
	void setstrVar(String strVar) {
		this.strVar=strVar;
	}
	 
	public String getStrVar() {
		String revString ="";// s h i v a m 6-1 
		for(int i=strVar.length()-1;i>=0;i--) {
			revString=revString+strVar.charAt(i);
		}
		return revString;
	}
	
	public StringBuffer getStrBVar() {
		StringBuffer sb = new StringBuffer(); 
		sb.append(strVar);
		return sb.reverse();     
	}
}
public class Pro_01String {
	public static void main(String[] args) {
		StringOperation obOperation = new StringOperation();
		obOperation.setstrVar("shivam");
		System.out.println("StringBuffer :"+obOperation.getStrBVar());
		System.out.println("Without StringBuffer :"+obOperation.getStrVar());
	}

}

/*Write a program to create class ‘MyException’ which extends java.lang.Exception class with a
private instance variable ‘name’ of java.util.String type containing a blank String as initial value.
a. Create a default constructor for the above MyException class.
b. Create parameterized constructor for MyException class as following
public MyException(String msg){
super(msg);
}
c. Inside MyException class also override the toString() method of java.lang.Object as following.
Public String toString(){
return “MyException : Name isn’t matching”;
}
d. Write a program to create a class ‘UserExceptionDemo’ which implements main method
where main() method throws IOException and MyException.
e. Inside main() method create a String variable tempName and initialize with a blank String.
Write try-catch block inside try block, declare String variable ‘name’ and initialize it with value
‘nacre’.
f. Print an appropriate message to get a name from console and after getting the name assign it to
the tempName variable.
g. Compare the two variables name and tempName using equals method of java.lang.String class
and if they are same print “Welcome to NACRE” else write the following code
throw new MyException("Hi .. "+tempName);
h. Handle MyException and IOException using catch blocks by printing appropriate user
friendly messags. In MyException catch block print in the console as following
System.out.println(e.getMessage()); System.out.println(e);
 ***Where ‘e’ is the object of MyException.
All*/
package dec23Exception;

public class ProMyException extends Exception {
	protected static String name;;
	public ProMyException() {

	}
	public ProMyException (String msg){
		super(msg);
	}
	@Override
	public String toString() {
		return "MyException : Name isn’t matching";
	}
	

}

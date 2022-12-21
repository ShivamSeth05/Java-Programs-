//Program-6
//Define a method which returns the string as "Even" if the given number is an even number, return "Odd" if the given number is an odd number, return string as "Invalid Input" if the given number is lessthan or equal to 0.
//Write the method with the following specifications: 
//Name of method: isEvenOrOdd() // which accepts an integer value as argument.
//Arguments: one argument of type integer
//Return Type: a String value (Even/Odd/Invalid Input) 
//Specifications: The value returned by the method isEvenOrOdd() is determined by the following rules:
//If the given number is negative or zero, return "Invalid Input"
//If the given number is even, return "Even"
//If the given number is odd, return "Odd"
//		

package oct26;
class IsEvenOdd{// sub classs name
	int a,b,c,d;
	void setvar(int a,int b,int c,int d) {
		
	}//setter method
	  String isEvenOdd() {
//	int a; // local var
		if(a==0||a<0) return "Invalid Input";
		else if(a%2==0)return "Even";
		return "Odd";
	}
}
public class Pro_6isEvenOrOdd {// main class
	public static void main(String[] args) {
		IsEvenOdd rs = new IsEvenOdd();// 
//		rs.a=10;// using obbj ref
		System.out.println(rs.isEvenOdd()); 

	}
}



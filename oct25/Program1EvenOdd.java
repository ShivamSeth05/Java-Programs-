//Program-1
//Define a method which returns the 1 if the given number is even, in other case return 0
//Name of method: isEven() // which accepts an integer value as argument and return 1 
//if the given number is even, else retrun 0.
//Argument: int
//Return type: an integer value 
//Example, if x = 22, return 1. if x = 35, return 0
		
package oct25;
import java.util.Scanner;

class IsEven{// sub class 
	
	int isEven() {
		System.out.println("Im method");
		return 1;
	}
	
	 IsEven(int a){ // non static method
		System.out.println("consd call"+a);
	}
}
public class Program1EvenOdd {// main class
	
	public static void main(String[] args) {// main method
		Scanner ob1 = new Scanner(System.in);// ob cration
		
		IsEven obEven = new IsEven(25);
		System.out.println(obEven.isEven());
		
	
//		
//		 int a =(int)ob1.nextFloat();  
//		System.out.println(a);
//		IsEven findeven = new IsEven(); // obj created
////		int a=7;
//		int re =findeven.isEven(a);
//		System.out.println(re);
	}
}






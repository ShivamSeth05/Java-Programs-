//Program-7
//Define a method which returns the square of the given number if it is an even, return cube of the given number if it is an odd number.
//Write the method with the following specifications: 
//Name of method: calculate() // which accepts an integer value as argument and return square of the given value if it is an even, return cube of the given value if it is an odd number.
//Arguments: one argument of type integer
//Return Type: an integer value 
//Specifications: The value returned by the method calculates () is determined by the following rules:
//If the given number is negative or zero, return -1.
//If the given number is even, return square of the number.
//If the given number is odd, return cube of the given number.

package oct26;

class CalCube{
	int calCube(int a){
		if(a<0||a==0)return -1;
		else if(a%2==0) return a*a;
		return a*a*a;
	}
}

public class Pro_7cube {
	public static void main(String[] args) {
		CalCube ob1 = new CalCube();
		System.out.println(ob1.calCube(3));
	}
}

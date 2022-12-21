//Program-20
//Define a method which accepts a value as number and returns the factorial of the value.
//Write the method with the following specifications: 
//Name of method getFactorial() // which accepts an integer
//value as argument and return the factorial of the given value.
//Arguments: one argument of type integer
//Return Type: an integer value
//Specifications: The value returned by the method getFactorial() 
//is determined by the following rules:
//Value must not be negative. If yes, then return   -1           
//Value must not be 0. If yes, then return -2

package oct28;

public class Pro_20getFactorial {
	int getFactorial(int num) {
		int fact=1;
		if(num<0)return -1;
		else if(num==0)return -2;
		else {
			for(int i=num;i>0;i--) {
				fact=fact*i;
			}
		}
		
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pro_20getFactorial ob1 = new Pro_20getFactorial();
		System.out.println(ob1.getFactorial(3));

	}

}

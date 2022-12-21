//Program-2
//Define a method which returns the greatest number among two numbers.
//Write the method with the following specifications: 
//Name of method: getGreatest() // which accepts two integer values as argument and return the greatest value.
//Arguments: two argument of type integer
//Return type: an integer value 
//Specifications: The value returned by the method getGreatest() is determined by the following rules:
//If any of the given numbers are negative, return -1.
//If any of the given numbers are zero, return -2.
//If the given numbers are positive, return the greatest.
//		
package oct25;

public class FindGretestNum {

	int getGreatest(int a ,int b){
		if (a<0||b<0)
			return -1;
		else if (a==0||b==0)
			return -2;			
		return a>b?a:b;
	}
	
	public static void main(String[] args) {
		FindGretestNum gnm = new FindGretestNum();
		int a =-2,b=20;
		int r= gnm.getGreatest(a ,b);
		System.err.println(r);

	}

}

//	Program-3
//	Define a method which returns the least number among two numbers.
//	Write the method with the following specifications: 
//	Name of method: getLeastNum() // which accepts two integer values as argument 
//	and return the least value.
//	Arguments: two argument of type integer
//	Return type: an integer value 
//	Specifications: The value returned by the method getLeastNum() is determined
//	by the following rules:
//	If any of the given numbers are negative, return -1.
//	If any of the given numbers are zero, return -2.
//	If the given numbers are positive, return the least number.
//			
package oct25;

public class Program3LeastNum {

	int getleast(int a , int b){
		if(a<0||b<0)
			return -1;
		else if (a==0||b==0)
			return -2;
		
		 return a<b?a:b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program3LeastNum leastNum = new Program3LeastNum();
		int a=10,b=20;
		int res = leastNum.getleast(a,b);
		System.out.println(res);
	}
}

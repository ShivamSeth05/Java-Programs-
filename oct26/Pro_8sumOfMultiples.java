//Program-8
//Define a method which returns the sum of three numbers 
//after rounding off each number to the next multiple of 10. 
//If any of the given number is multiple of 10 don't change it's value
//Write the method with the following specifications: 
//Name of method: sumOfMultiples() // which accepts three integer value as argument 
//and return the sum of three numbers after rounding off each number to the next multiple of 10. 
//Arguments: three argument of type integer
//Return Type: an integer value 
//Example
//If a = 23, b = 34, c = 69
//   30 + 40 + 70 = 140
//If a = 23, b = 34, c = 50
//   30 + 40 + 50 = 120
//Specifications: The value returned by the method sumOfMultiples() is determined by 
//the following rules:
//If any of the given number is negative or zero, return -1.

package oct26;
class SumOfMultiples{
	int sumOfMultiples(int a , int b , int c){
		int sum=0,t,s,t1,t2;
		if(a<1|| b<1||c<1)
			return -1;
		//23 34 50
			 t=a%10;t1=b%10;t2=c%10;
			 if(t!=0){
			  s=10-t;
			  a=(a+s);// 30 
			  }
			 if(t1!=0){
			  s=10-t1;
			  b=(b+s);//40
			 }
			 if(t2!=0) {
			  s=10-t2;
			  c=(c+s);
			}
			sum=a+b+c;// 30 40 50 =120
			return sum;
	}
}

public class Pro_8sumOfMultiples {

	public static void main(String[] args) {
		SumOfMultiples ob = new SumOfMultiples();
		int rsr = ob.sumOfMultiples(23, 34, 50);
		System.out.println(rsr);

	}

}

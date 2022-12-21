//Program-3
//----------
//Write the program which accepts an integer value, and check the given number is an perfect, 
//abundant or deficient number.
//
//Explanation:
//A number is called perfect if the sum of its proper divisors is equal to the number. If the 
//sum is less, it is called a deficient number. If the sum is more than the number, it is called 
//an abundant number.
//
//Example:
//The proper divisors of 28 are 1, 2, 4, 7, 14. The sum of those factors 1 + 2 + 4 + 7 + 14 is 
//28, which equal to the number. Hence it is called a perfect number.
//Similarly if the sum is less than the number, it is called a deficent number. If the sum is 
//greater than the number, it is called an abundant number.
//
//Note:
//A number is not a proper divisor of itself. Proper divisors of 6 are 1, 2 and 3 only.
//
//Define the below methods with the following specifications: 
//
//Name of method sumOfProperDivisors()// accepts an integer value, return 0 
//if the given number is an perfect number, -1 if it is an deficient, return 1 
//if it is an abundant number
//Arguments: One argument of integer value.
//Return Type: an integer value
//
//Specifications: The value returned by the method sumOfProperDivisors() 
//is determined by the following rules:
//
//If the sum of proper divisors is equal to the given number, return 0.
//If the sum of proper divisors is more than the given number, return 1.
//If the sum of proper divisors is less than the given number, return -1.
//If the given number is negative, return -2.
//If the given number is zero, return -3.
//
//Example:
//
//Input: 28
//Output: 0
//
//Input: 12
//Output: 1
//
//Input: 23
//Output: -1
//
//Input: -12
//Output: -2
//
//Input: 0
//Output: -3
package oct31;

public class SumOfProperDivisors {
	int sumOfProperDivisors(int num){;
		int i,prod=0;
		if(num<0) return -2;
		if(num==0) return -3;
		for(i=1;i<=num/2;i++) {
			if(num%i==0)
			prod=prod+i;
		}
		System.out.println(i);
		
		return prod>num?1:prod==num?0:-1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfProperDivisors ob1= new SumOfProperDivisors();
		System.out.println(ob1.sumOfProperDivisors(23));
		

	}

}

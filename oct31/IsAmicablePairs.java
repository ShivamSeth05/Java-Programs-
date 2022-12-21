//  Program-1
//----------
//Write a program to find out the given two numbers are  amicable pairs or not?
//Explanation:
//Amicable numbers are two different numbers 'a' and 'b' so related that the sum of
//the proper divisors of 'a' is equal to number 'b', simillerly sum of the proper 
//divisors of 'b' is equal to number 'a'. 
//A proper divisor of a number is a positive integer divisor other than the number itself. 
//Example:
//220 and 284 are amicable pairs as the proper divisors of 220 \
//are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110. Their sum is 284. 
//The proper divisors of 284 are 1, 2, 4, 71, and 142, of which the sum is 220.
//Define the below methods with the following specifications: 
//Name of method isAmicablePairs()
//Arguments:2- arguments of the type int
//Return Type: an Integer value 1 when numbers are AmicablePairs otherwise return 0
//
//Example:
//Input : 220 284 
//Output: 1
package oct31;

public class IsAmicablePairs {
	
	int isAmicablePairs(int num1,int num2) {
		int max=num1>num2?num1:num2;
				int num1sim=0,num2sim=0;

		for(int i=1;i<=max/2;i++) {
			if(num1%i==0) {
				num1sim=num1sim+i;
			}
			if(num2%i==0) {
				num2sim=num2sim+i;
			}
		}
		if(num1==num2sim&&num2==num1sim)
		return 1;
		return 0;
	}

	public static void main(String[] args) {
	
		IsAmicablePairs ob1 = new IsAmicablePairs();
		System.out.println(ob1.isAmicablePairs(220,284));

	}

}

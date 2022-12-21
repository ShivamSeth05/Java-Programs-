/*
Program-1
=========
Write a program which counts the number of left truncatable primes between the given range.
Explanation:
In number theory, a left-truncatable prime is a prime number which, in a given base, contains no 0, and if the leading ("left") digit is successively removed, 
then all resulting numbers are prime. 
For example 9137 is a left-truncatable prime, since 9137, 137, 37 and 7 are all prime.
            1013 is not a left-truncatable prime, as it contains a digit 0.
 
Define the below methods with the following specifications: 

Name of method getCountOfLeftTruncatablePrimes()//returns the count of left-truncatable primes with in the given range.
Arguments: Two integer values
Return Type: an integer value

Specifications: The value returned by the method  getCountOfLeftTruncatablePrimes() is determined by the following rules:

If the start value is greater than end value, return -1
If the start or end value are negative, return -2
If the start or end value are zero, return -3
other case return the count of left-truncatable primes.


Name of method isLeftTruncatablePrime()//return true if the given value is a left-truncatable prime, else return false.
Arguments: One argument of integer value.
Return Type: an boolean value

Example:
Input : 223 / 1523 / 9397 / 27283
Output: true

Input : 220 / 1013 
Output: false

Name of method isPrime()//return true if the given value is a prime, else return false.
Arguments: One argument of integer value.
Return Type: an boolean value

Note: 1 is not a prime

Example:
Input : 17 / 59 / 2
Output: true

Input : 1 / 14
Output: false
*/
package nov_03;

import java.util.Scanner;

class GetCount{
	int getCountOfLeftTruncatablePrimes(int num1 ,int num2){
		int c=0;
		for(int i=num1;i<=num2;i++) {
			Prime pm = new Prime();// 
			LeftTrunc lt = new LeftTrunc();
			if(pm.isPrime(i)==true) {
				if(lt.isLeftTruncatablePrime(i)==true) {
					c++;
				}
				
			}
			
		}
	return  c;
}
}//count

class LeftTrunc{
	boolean isLeftTruncatablePrime(int num){//13
		int c=0,n=num;
		while(n!=0){
			c++;
			int r= n%10;if(r==0)return false;
			n=n/10;
		}//c=2
		int t = (int)Math.pow(10,c-1 ); //10
		while(num!=0) {
			 int rightdigi = num%t; //03  13%10=3
			 Prime pm = new Prime();
			Boolean ckp=pm.isPrime(rightdigi);
			if(ckp==true){
			 num=rightdigi;//3
			 t=t/10;
			 System.out.println(t);
			 if(t==1)num=0;
			}
			if (ckp==false) {
				return false;
			}	
		}
		System.out.println("tt");
		return true;
}
}//lft Trun clss 

class Prime{
	boolean isPrime(int num){
		if(num==0||num==1)
			return false;
//	System.out.println("didgit is "+num);
		for(int i=2;i<=num/2;i++)
			if(num%i==0)
				return false;
		return true;
			
}
}//Prime class

public class Pro_1lefttruncatableprimes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number num 1 and num");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		GetCount gtCount =  new GetCount();// 
		LeftTrunc gt =  new LeftTrunc();	
//		System.out.println(gt.isLeftTruncatablePrime(103));
		System.out.println(gtCount.getCountOfLeftTruncatablePrimes(num1,num2));
	}
}

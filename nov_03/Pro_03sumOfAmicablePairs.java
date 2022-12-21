//Program-3
//==========
//Write a program which calculates the sum of all amicable pairs till 1 Million.
//
//Explanation:
//Amicable numbers are two different numbers 'a' and 'b' so related that the sum of 
//the proper divisors of 'a' is equal to number 'b', simillerly sum of 
//the proper divisors of 'b' is equal to number 'a'. 
//A proper divisor of a number is a positive integer divisor other than the number itself. 
//
//Example:
//220 and 284 are amicable pairs as the proper divisors of 220 are
//1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110. Their sum is 284. 
//The proper divisors of 284 are 1, 2, 4, 71, and 142, of which the sum is 220.
//
//Define the below methods with the following specifications: 
//
//Name of method sumOfAmicablePairs()// return the sum of all amicable pairs till 1 Million.
//Arguments: No
//Return Type: an Integer value
//
//Name of method getSumOfProperDivisors()//accepts an integer value as argument 
//and return the sum of the proper divisors of the given number
//Arguments: One argument of integer value.
//Return Type: an integer value
//
//Example:
//Input : 220
//Output: 284
//
//Input : 1184
//Output: 1210
//




package nov_03;

import javax.sound.midi.SysexMessage;

public class Pro_03sumOfAmicablePairs {
	
	int getSumOfProperDivisors(int num) {
		int s=0;
		for(int i=1;i<=num/2;i++) {
			
			if(num%i==0) {
				s=s+i;
			}
		}
		return s;	
	}
	int coidsumOfAmicablePairs() {
		int t=0;
		for(int i=1;i<1000000;i++) {
			int sod1=getSumOfProperDivisors(i);
//			System.out.println(i+ " f"+sod1);
			int sod2=getSumOfProperDivisors(sod1);
//			System.out.println(sod2+ " "+sod1);
			if(i==sod2) {
				 t= t+i;
				
				System.out.println(sod1 + " "+sod2);
				
			}
		}System.out.println(t);
		return 0;
	}

	public static void main(String[] args) {
		
		Pro_03sumOfAmicablePairs ob1 = new Pro_03sumOfAmicablePairs();
		ob1.coidsumOfAmicablePairs();
		

	}

}

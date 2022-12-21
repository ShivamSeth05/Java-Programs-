//Program-2
//==========
//Write a program to get the sum of all armstrongs which contains all 
//odd digits with in the given range.
//
//Explanation:
//An Armstrong number is an n-digit number that is equal to the sum of
//the nth powers of its digits.
//Example:
//153 = 1^3 + 5^3 + 3^3  = 1 + 125 + 27 = 153
//1634  1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1634
// 
//Define the below methods with the following specifications: 
//
//Name of method getSumOfAllArmstrongNums()//returns the sum of all 
//armstrongs, which contains all odd digits wiht in the range
//Arguments: Two integer values
//Return Type: an integer value
//
//Specifications: The value returned by the method  getSumOfAllArmstrongNums() 
//is determined by the following rules:
//
//If the start value is greater than end value, return -3
//If the start or end value are negative, return -1
//If the start or end value are zero, return -2
//other case return the sum of all armstrongs with contains all odd digits.
//
//Name of method isArmstrong()//return true if the given value is an armstrong,
//else return false.
//Arguments: One argument of integer value.
//Return Type: an boolean value
//
//Example:
//Input : 153 / 370 / 407 / 1634 / 9474
//Output: true
//
//Input : 152 / 1013 
//Output: false
//
//Name of method sumOfPowersOfDigits()//return the sum of powers of it's digits 
//of the given number
//Arguments: One argument of integer value.
//Return Type: an integer value
//
//Example:
//Input : 153
//Output: 153
//
//Input : 407
//Output: 407
//
//Input : 182
//Output: 521
//
//Name of method getDigits()//return an array of integer contains the digits 
//of the given number, in same order
//Arguments: One argument of integer value.
//Return Type: an integer array
//
//Example: 
//Input: 153
//Output: {1, 5, 3}
//
//Input: 5307
//Output: {5, 3, 0 7}
//
//Name of method containsAllOddDigits()//return true 
//if the given number contains all odd digits
//irguments: One argument of integer value.
//Return Type: an boolean value
//
//Example: 
//Input: 153
//Output: true
//
//Input: 5307
//Output: true
//
//Input: 5247
//Output: false 
//
//Note: As zero is not even or odd, if the number contains zero in it and all 
//the other digits are odd return true. so, 5307 return true.




package nov_03;

import java.util.Scanner;

public class Pro_2Oddarmstrongs {
	
	int getSumOfAllArmstrongNums(int num1,int num2) {
		if(num1>num2)return -3;
		if(num1<0||num2<0)return -2;
		int s=0;
		for(int i=num1;i<=num2;i++) {
			if(isArmstrong(i)==true) {
				 s=s+sumOfPowersOfDigits(i);
//				 System.out.println(s);
			}
		}return s;     
	}//get Sum Of All ArmstrongNums
	
	boolean isArmstrong(int num){
		int f,n,c=0,s=0;
		f=n=num;
		while (n!=0) {
			c++;
			n=n/10;
		}//digit count
		while (num!=0) {
			int r = num%10;
			 s=s+(int)Math.pow(r, c);
			 num=num/10;
		}//arm
		if(s==f)
		return true;
		return false;
	}// is Armstrong
	
	int sumOfPowersOfDigits(int num) {
		if(num<10)
		{
			if(num%2!=0)
			return num;
			 return 0;
		}
			else {
				int n=num;
				while(n!=0) {
				int r=n%10;
				if(r!=0) {
					if(r%2==0)
					return 0;
				}
				
				n=n/10;
				}return num;	    
			}
			
	}//sum Of Powers Of Digits
	
	boolean containsAllOddDigits(int num) {
		return true;
		
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Pro_2Oddarmstrongs ob1 = new Pro_2Oddarmstrongs();
//		System.out.println(ob1.sumOfPowersOfDigits(153));
		System.out.println(ob1.getSumOfAllArmstrongNums(scanner.nextInt(),scanner.nextInt()));

	}

}

/*
 * Program-4
=========
Write logic for generating quadratic sequence as follows.
Quadratic Sequence
A quadratic sequence is a sequence of numbers in which the second 
difference between any two consecutive terms is constant.
Example
1,3,6,10,15,21,28,36,45,55, ...
Sequence starts with 1 and then incremented by 2, 3, 4, 5, ...
Define the following method
Name of Method 	: getQuadricSequence()
Arguments		: integer
Return type		: String
Example
Input 	: 2
Output	: 1,3	
Input 	: 5
Output	: 1,3,6,10,15	
Input 	: 10
Output	: 1,3,6,10,15,21,28,36,45,55
Method should meet the following functional expectations
1. Generate given sequence containing given number of terms
2. Return null, if given number is negative or zero.
     
 */

package nov_04;

import java.util.Scanner;

public class Pro_4getQuadricSequence {
	String getQuadricSequence(int num) {
		if(num<1)return null;
		int d=2;
		String str="";
		int incr=1;
		for(int i=1;i<=num;i++) {
			str=str+incr+" ";
			incr=incr+d;//3
			d++;
		}
		return str;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Pro_4getQuadricSequence ob1 = new Pro_4getQuadricSequence();
		System.out.println(ob1.getQuadricSequence(scanner.nextInt()));

	}

}

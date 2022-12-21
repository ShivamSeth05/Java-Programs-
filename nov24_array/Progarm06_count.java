/*
 * Program-6
==========
Define the method which accepts two integer arguments, an integer array and integer value, 
which return the number of time the given value exist in the array.
Note: The elements in an array can be negative
Name of Method: getCount() // Which returns the number of time 
the given value exist in the array.
Arugments: Two arguments of an integer array and integer value to search
Return Type: an integer value
Specifications: The value returned by the method sumOfArray() is determined
 by the following rules
If the array is empty or null, return -1
In other case return the integer value, indicating the number of times
 the element exist in the array

 */

package nov24_array;


import java.util.Scanner;

class Sub1{
	
	static int sumOfArray(Integer a[],int key) {
		int c=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==key) {
			c++;
			}
		}
		return c;
	
	}
}


public class Progarm06_count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] ob= new Integer[5];
		for (int i = 0; i < ob.length; i++) {
			ob[i]= sc.nextInt();		
			}
		System.out.println(Sub1.sumOfArray(ob, 3));
	}
	

}

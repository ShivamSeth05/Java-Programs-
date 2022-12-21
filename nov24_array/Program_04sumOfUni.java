/*
 * Program-4
==========
Define a method which accepts an array of numbers and return the sum of unique numbers from the array.
Write the method with the following specifications: 
Name of method sumOfArray() 
Arguments: one argument of type integer array
Return Type: an integer value
Specifications: The value returned by the method sumOfArray() is determined by the following rules:
Array must not be null or length must not be 0. If yes, then return -1                                                          
Array must not contain negative values. If yes, then return -2
Input: {1, 2, 3, 2, 4, 1}
Output: 7
 */

package nov24_array;

import java.util.Scanner;

class sub{
	static int sumOfArray(Integer a[]) {
		if(a.length==0)return-1;
		
		boolean f=false;
		int s=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<0)return-2;
			f=false;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					f=true;
					a[j]=0;
				}
				
			}
			if(f==false) s=s+a[i];
			
		}
		return s;
	
	}
}

public class Program_04sumOfUni {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array szie");
		int n = scanner.nextInt();		
		Integer ob[]= new Integer[n];
		for (int i = 0; i < ob.length; i++) {
			ob[i]=scanner.nextInt();
		}
		System.out.println(sub.sumOfArray(ob));

	}

}

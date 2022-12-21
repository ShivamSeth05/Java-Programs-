/*
 * Program-5
==========
A class FillMultiples.java is given to you.
Implement logic for the following method method 
public static int[] getMultiplesArray(int number). 
This method should create a new integer array of size 10 and fill it with the multiples (multiples 1 to 10) of the given number. 
and return the array.
If the given number is negative or zero, return null.
 */
package nov24_array;

class subs{
	public static int[] getMultiplesArray(int number) {
		int i=0;
		int ob[]= new int[10];
		while(i<10) {
			ob[i]=number*(i+1);
			i++;
		}
		
		return ob;
		
	}
}

public class Program05FillMultiples {

	public static void main(String[] args) {
		int ob[]= new int[10];
		 ob=subs.getMultiplesArray(5);
		 for (int i : ob) {
			 System.out.print(i+" ");
		}
		

	}

}

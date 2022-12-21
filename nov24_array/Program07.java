/*\
 * ==========
Define a static Method that counts and returns the number of odd numbers from given input arrray as a string.
Write the method with following specifications
Name of method : getOddCount
Arguments : One Integer Array 
Return Type : A String value
The array parameter can be of exact size 5 only, other wize return -1 as string.
If any of the array element is 0 or negative then return -2 as string.
If all array elements are even then return -3 as string.
If array is null then return -4 as string.
Example :
	input :  { 1,2,3,4,5 }
	output : "3"
	input : {2,4}
	output: "-1"
 */

package nov24_array;

import java.util.Scanner;

class OddCount {
	public static String getOddCount(Integer[] inputArray){
		if(inputArray==null)
			return "-4";
		if(inputArray.length!=5)
			return "-1";		
		int count=0;
		for(int i:inputArray){
			if(i<=0)
				return "-2";
			if(i%2!=0)
				count++;
		}		
		if(count==0)
			return "-3";
		else
		return ""+count;
	}

	
}
public class Program07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] ob= new Integer[5];
		for (int i = 0; i < ob.length; i++) {
			ob[i]= sc.nextInt();		
			}
		System.out.println(OddCount.getOddCount(ob));
	

	}

}

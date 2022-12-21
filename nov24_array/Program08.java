
//Program-7
//==========
//Define a static Method that makes the sum of all odd numbers from given 
//input arrray and sends integer.
//Write the method with following specifications
//Name of method : getOddSum
//Arguments : One Integer Array 
//Return Type : Integer
//The array parameter can be of exact size 5 only, otherwize return -1.
//If any of the array element is 0 or negative then return -2
//If all array elements are even then return -3.
//If array is null then return -4.
//Example :
//	input :  { 1,2,3,4,5 }
//	output : 9
//	input : {25,32,4}
//	output: -1
//Solution
//---------
package nov24_array;

import java.util.Scanner;

class Program08 {
	public static int getOddSum(int[] inputArray)	{
		if(inputArray==null)
			return -4;
		if(inputArray.length!=5)
			return -1;
		int sum=0;
		for(int i:inputArray){
			if(i<=0)
				return -2;
			if(i%2!=0)
				sum+=i;
		}		
		if(sum==0)
			return -3;
		else
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ob= new int[5];
		for (int i = 0; i < ob.length; i++) {
			ob[i]= sc.nextInt();		
			}
		int r = getOddSum(ob);
		System.out.println("Sum of all odd numbers is:"+r);

	}

}
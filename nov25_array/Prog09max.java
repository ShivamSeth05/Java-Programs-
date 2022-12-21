/*
 * Program-9
==========
Define a static Method that searches and returns the maximum number from an array. 
The array is given as an parameter to the function.

Write the method with following specifications

Name of method : findMax
Arguments : One integer array
Return Type : int

Return -1 if input is not containing atleast 3 negative numbers.
Return 0 if input array is null

Example :
	input :  {1,2,3,-3,-6,-6}
	ouput : 3
 */
package nov25_array;


public class Prog09max {
	class Max{
		static int findMax(int[] a ) {
			int nc=0;
			for (int j = 0; j < a.length; j++) {
			if (a[j]<0) {
				nc++;
			}
				
			
			 
			
			}
			if(nc<3)return -1;
			int max=a[0];
			for (int i = 0; i < a.length; i++) {
				if(max<a[i])max=a[i];
			}
			return max;
	
	}
	}
	

	public static void main(String[] args) {
		int a[]= {1,2,3,-3,-6,-6};
		System.out.println(Max.findMax(a));

	}

}

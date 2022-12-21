/**
 * Program-10
-----------
Write code for calculating row-wise sum of array of size 3 X 3

Define the following method

Name of Method	: getRowSum() // accepts 2-D array and return 1-D array contains row-wise sum 
Argument		: int[][]
Return type		: int[]

Input: array has the following elements

1 2 3
1 2 3
1 2 3 

Output: array should contain following elements

6 6 6

Method should meet the following functional expectations

1. Method should take only 3 X 3 array and should return one-dimension array contains row-wise sum.
2. Return null, If array size is not 3 X 3.
3. Return null, If input is null.
 */
package nov25_array;

import java.util.Scanner;


class RowSum{
	static int[] getRowSum(Integer[][] arr, int n) {
		int result[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr.length;j++) {
				sum+=arr[i][j];
			}
			result[i]=sum;
		}
		return result;
		
	}
}
public class Pro10getrowumm {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int n=Integer.parseInt(scanner.nextLine());
		Integer a[][]=new Integer[n][n];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.println("Enter "+"a["+i+"]"+"["+j+"]"+"Element");
				a[i][j]=scanner.nextInt();
			}
		}
		int res[]=new int[n];
//		res=RowSum.getRowSum(a, n);
		for(int k:RowSum.getRowSum(a, n)) {
			System.out.println("Sum of Row Sum:"+k);
		}
	}

}
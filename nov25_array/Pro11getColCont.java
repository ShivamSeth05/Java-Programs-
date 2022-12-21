package nov25_array;

/**
 * Program-11
===========
Write a method for calculating column-wise sum of array of size 3 X 3

Define the following method

Name of Method	: getColumnSum() // accepts 2-D array and returns 1-D array containing column-wise sum
Arguments		: int[][]
Return type		: int[]

Input: array has the following elements

1 2 3
1 2 3
1 2 3 

Output: array should contain following elements

3 6 9

Method should meet the following functional expectations
1. Method should take only 3 X 3 array and should return one-dimension array contains column-wise sum
2. if array size is not 3 X 3 return null.
3. if input is null return null.

 */


import java.util.Scanner;

class ColSum{
	static int[] getColumnSum(Integer[][] arr, int n) {
		int result[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr.length;j++) {
				sum+=arr[j][i];
			}
			result[i]=sum;
		}
		return result;
		
	}
}
public class Pro11getColCont {
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
		res=ColSum.getColumnSum(a, n);
		for(int k:res) {
			System.out.println("Sum of Row coloumn:"+k);
		}
	}

}
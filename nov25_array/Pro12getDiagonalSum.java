package nov25_array;

/**
 * Program-12
===========
Write code for calculating sum of diagonal elements(TopLeft to BottomRight) of an array of size 3 X 3.

Define the following method

Name of Method	: getDiagonalSum() // accepts 2-D array and returns the sum of diagonal elements.
Arguments		: int[][]  // A Two dimensional int array
Return type		: int 

Input: array has the following elements

1 2 3
1 8 3
1 2 4 

Output: 
13


Method should meet the following functional requirements.

1. Method should take only 3 X 3 array and should return diagonal sum.
2. Return -1, If array size is not 3 X 3.
3. Return -1, If input is null.

 */
/*
		1 2 3
		4 5 6
		7 8 9
					*/
import java.util.Scanner;

class DiagonalSum{
	static int getDiagonalSum(Integer[][] arr, int n) {
		int sum=0;
		int result[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==j) {
					
					sum+=arr[i][j];
				}
			}
//			result[i]=sum;
		}
		return sum;
		
	}
}
public class Pro12getDiagonalSum {
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
		System.out.println(DiagonalSum.getDiagonalSum(a, n));
	}

}

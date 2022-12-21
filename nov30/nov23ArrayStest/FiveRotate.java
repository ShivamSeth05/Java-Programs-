package nov23ArrayStest;

import java.util.Scanner;

public class FiveRotate {
// 1 2 3 4 5 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of array");
		int n =sc.nextInt();
		int a[]= new int[n];
		System.out.println("enter "+n+" element");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		} 
		System.out.println("Enter rotation num");
		int r=sc.nextInt();
		for (int i = r; i < a.length; i++) {//1 2 3 4 5
			System.out.print(a[i]);
			
		}
		for (int i = 0; i < r; i++) {
			System.out.print(a[i]);
		}

	}

}

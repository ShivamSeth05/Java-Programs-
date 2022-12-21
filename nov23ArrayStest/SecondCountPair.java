package nov23ArrayStest;

import java.util.Arrays;
import java.util.Scanner;

public class SecondCountPair {
	
	static int countpairsWithDiffk(int arr[],int k){// 2 5 6 8 4
		Arrays.sort(arr);// 2 4 5 6 8
		int c=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]-arr[j]==-k) {
					c++;
				}
			}
		}
		if(c==0)return-1;
		return c;
		
	}

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
		System.out.println("enter pairs");
		int pairs=sc.nextInt();
		System.out.println(SecondCountPair.countpairsWithDiffk(a,pairs));

	}

}

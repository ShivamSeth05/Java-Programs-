package nov23ArrayStest;

import java.util.Arrays;
import java.util.Scanner;

public class FirstQus {
	
	class CountTriangle{
		static int countTriangle(int a[],int n) {// 3 1 4 2 5
			int c=0;
			Arrays.sort(a);// 1 2 3 4 5
			  for (int i = 0; i < n; i++)// 0 1
		            for (int j = i + 1; j < n; j++)// 1 
		                for (int k = j+1; k < n; k++) {
//		                	System.out.println(a[i] +" "+ a[j]+" "+ a[k]);
		                	/*if (a[i] + a[j] > a[k]&&
		                		a[i]+a[k]>a[j]&&
		                		a[j]+a[k]>a[i])*///without sort
		                	if (a[i] + a[j] > a[k])//with sort
		                        c++;
		                }    
		        return c;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		int a[]= new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		int s=a.length;
		System.out.println(CountTriangle.countTriangle(a,s));

	}

}

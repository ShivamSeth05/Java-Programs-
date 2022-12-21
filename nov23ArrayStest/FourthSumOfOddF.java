package nov23ArrayStest;

import java.util.Scanner;

public class FourthSumOfOddF {

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
		int odsum=0,c=1;
		// 1 1 2 2 3 3 3 
		// 1 2 4 5 6 3 1 2 3 3
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
				c++;
				a[j]=0;// dupicate ele set 0
				}
			}
//			System.out.println(c);
			if(c%2!=0) {
				odsum+=a[i]*c;
//			System.out.print("\n"+a[i]+" "+odsum);
			}
			c=1;
		}
		System.out.println(odsum);

		
	}

}

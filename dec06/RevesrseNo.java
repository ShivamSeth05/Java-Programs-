package dec06;

import java.util.Scanner;

public class RevesrseNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n ;
		System.out.println("Enter the size of array");
		n = sc.nextInt();
		Integer ob[] = new Integer[n];
		for (int i = 0; i < ob.length; i++) {
//			System.out.println("Enter "+(i+1));
			ob[i]=sc.nextInt();
			}
		
		for (int i = 0; i < ob.length; i++) {
			int rev=0,rm;
					int no=ob[i];
			while (no!=0) {
				rm=no%10;
				rev=rev*10+rm;
				no=no/10;
			}
			ob[i]= rev;
			rev=0;
		}
		for (int i = 0; i < ob.length; i++) {
			System.out.print(ob[i]+" ");
			}

	}

}

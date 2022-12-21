package nov23ArrayStest;

import java.util.Scanner;

class FindOcc{
	static int findNumOcc(int a[],int ele,int occ) {
		int c=0;
		for (int i = 0; i < a.length; i++) {
			if(ele==a[i]) {
				c++;
				if(c==occ) {
					return i;
				}
			}
		}
		return -1;
		
	}
}
public class Thirdfind_n_occ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of array");
		int n =sc.nextInt();
		int a[]= new int[n];
		System.out.println("enter "+n+" element");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("enter seraching ele");
		int ele=sc.nextInt();
		System.out.println("enter occc :");
		int occ=sc.nextInt();
		System.out.println(FindOcc.findNumOcc(a,ele,occ));

	}

}

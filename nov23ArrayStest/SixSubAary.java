package nov23ArrayStest;
import java.util.Scanner;
public class SixSubAary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of array");
		int n =sc.nextInt();
		int a[]= new int[n];
		System.out.println("enter "+n+" element");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		} 
		int m=0,cm=0;
		// 4 -5 2 1	
		// -2 -5 6 -2 -3 1 5 -6
		m=0;
		for (int i = 0; i < a.length; i++) {
			m=m+a[i];
			System.out.print(m+" ");// 
			if(cm<0)m=0;
			if(m<0)m=0;
			if(m>cm)cm=m;
	
		}
		System.out.println("\n->"+cm);
		sc.close();
	}	
}

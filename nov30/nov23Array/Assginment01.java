package nov23Array;

import java.util.Scanner;


public class Assginment01 {

	public static void main(String[] args) {
		System.out.println("Enter Size of array");
		String rs="";
		Scanner sc = new Scanner(System.in);
		int n =Integer.parseInt( sc.nextLine());
		String ob[] = new String[n];
		for(int i=0;i<n;i++) {
			ob[i]=sc.nextLine();
		}
		System.out.println("enter des");
		String deg=sc.nextLine();//se
		for(int i=0;i<n;i++) {
			if(ob[i].startsWith(deg)) {
				rs=rs+ob[i]+" ";
			}
		}
		System.out.print(" -->"+rs);   
		
		

	}

}

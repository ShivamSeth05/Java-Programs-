package nov23Array;

import java.util.Arrays;
import java.util.Scanner;


class SubClass{
	 static int findRange(Integer ob[]) {
		 Arrays.sort(ob);
		return ob[ob.length-1]-ob[0];
		 
	 }
}

public class Pro_2Range {

	public static void main(String[] args) {
	Scanner obs = new Scanner(System.in);
	System.out.println("Enter the size of array");
	int size= obs.nextInt();
	Integer obi[] = new Integer[size];
	for(int i=0;i<obi.length;i++) {
		obi[i]=obs.nextInt();
		}
	System.out.println("Range is "+SubClass.findRange(obi));

	}

}

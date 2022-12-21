/*
 Array Median
 
 */


package nov23Array;

import java.util.Arrays;
import java.util.Scanner;
class cal{
	int getMedian(Integer ab[]) {
		int  len=ab.length;
		if(len%2==0) {
			return (ab[len/2] + ab[(len/2)-1])/2;
		}
		return ab[len/2];
	}
}
public class Pro_1Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Size :");
		int n = sc.nextInt();
		
		Integer ob[] = new Integer[n];
		
		for (int i=0;i<ob.length;i++) {
			ob[i]=sc.nextInt();
		}
		
		Arrays.sort(ob);

		cal obCal = new cal();
		System.out.println("Medi"+ obCal.getMedian(ob));
        sc.close();
	}

}

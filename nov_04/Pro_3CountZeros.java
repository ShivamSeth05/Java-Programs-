/*
 * Program-3
==========
Write logic for counting number of zeros in a given number. 
Define following method
Name of Method:	countZeros()
Arguments	:  	integer
Return type: 	integer 
Input 	: 1234
Output  : 0
Input 	: 1230
Output  : 1
Input 	: 1000
Output  : 3
Input 	: 0
Output  : 1
Method should meet the functional expectations
1. Return number of zeros in a given number.
2. It should work for positive and negative and zero.
 */
package nov_04;
import java.util.Scanner;
public class Pro_3CountZeros {

	int countZeros(int num){
		if(num==0)return 1;
		int c=0;
		while(num!=0) {
			int r=num%10;
			if(r==0)c++;
			num=num/10;
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Pro_3CountZeros ob1 = new Pro_3CountZeros();
		System.out.println(ob1.countZeros(a));

	}

}

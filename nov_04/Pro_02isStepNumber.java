//Program-2
//==========
//Write logic to return true if if given number is step number otherwise return false
//Step Number:
//if the difference between any two adjacent digits is 1 then it is step number.
//Define following method
//Name of Method		:	isStepNumber()
//Arguments		:  	integer
//Return type		: 	boolean 
//Input 	: 1234
//Output  : true
//Input 	: 98765
//Output  : true
//Input 	: 1279
//Output  : false
//Method should meet the following functional expectations
//1. Return true if the difference between any two adjacent digits is 1, otherwise return false
package nov_04;

import java.util.Scanner;

public class Pro_02isStepNumber {
	boolean isStepNumber(int num) {
		for(int i=0;num!=0;i++) {
			int ld=num%10;
			num=num/10;
			if(num==0)break;
			int ad=num%10;
			System.out.println(ld+" "+ ad);
			int max=ld>ad?ld:ad;
			int min=ld<ad?ld:ad;
			if(max-min!=1)return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a= scanner.nextInt();   
		Pro_02isStepNumber ob1 = new Pro_02isStepNumber();
		System.out.println(ob1.isStepNumber(a));
	}

}

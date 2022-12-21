//Write logic to return true if sum of alternate digits is same
//Example - 1
//12345
//1 + 3 + 5 = 9
//2 + 4 = 6
//As 9 is not equal to 6 return false
//Example - 2
//15345
//1 + 3 + 5 = 9
//5 + 4 = 9
//As 9 is not equal to 9 return true
//Define following method
//Name of Method	:	isSameSum()
//Arguments		:  	integer
//Return type		: 	boolean 
//Input 	: 1234
//Output  : false
//Input 	: 121242
//Output  : true
//Method should meet the following functional expectations
//1. Return true if two sums of alternate digits is same otherwise return false
//2. It should work for negative numbers. 

package nov_04;

public class Pro_01_isSameSum {
	
	boolean isSameSum(int num) {
		int evenPlace=0,oddPlace=0;
		for(int i=0;num!=0;i++) {
			int r=num%10;
			if(i%2==0) {
				evenPlace=evenPlace+r;
			}else {
				oddPlace=oddPlace+r;
			}
			num=num/10;
		}
		if(evenPlace==oddPlace)
		return true;
		return false;
	}

	public static void main(String[] args) {
		Pro_01_isSameSum ob1= new Pro_01_isSameSum();
		System.out.println(ob1.isSameSum(12345));

	}

}

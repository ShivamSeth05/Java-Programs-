//Program-5
//----------
//Write logic to return true if sum of alternate digits is same
//
//Example - 1
//12345
//
//1 + 3 + 5 = 9
//2 + 4 = 6
//
//As 9 is not equal to 6 return false
// 
//Example - 2
//
//15345
//
//1 + 3 + 5 = 9
//5 + 4 = 9
//
//As 9 is not equal to 9 return true
//
//Define following method
//
//Name of Method	:	isSameSum()
//Arguments		:  	integer
//Return type		: 	boolean 
//
//Input 	: 1234
//Output  : false
//
//Input 	: 121242
//Output  : true
//
//
//
//Method should meet the following functional expectations
//
//1. Return true if two sums of alternate digits is same otherwise return false
//2. It should work for negative numbers. 
//
package oct31;

public class IsSameSum {
	
	boolean isSameSum(int num){
		if(num<0) num=num*-1;
		int odsum=0,evensum=0;
		for(int i=1;num!=0;i++) {
			int t=num%10;
			if(i%2!=0) {
				
				evensum=evensum+t;
			}
			else {
				odsum=odsum+t;
			}
			num=num/10;
		}
		
			if(odsum==evensum)
				return true;
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsSameSum isSum=new IsSameSum();
		System.err.println(isSum.isSameSum(-15345));
	}

}

//Program-18
//Define a Method that checks for whether a given input is a palindrome number or not,
//and return a string.
//Write the method with following specifications
//Name of method: checkPalindrome
//Arguments: 1 Integer Argument 
//Return Type: A String value
//Value must not be negative. If yes, then return   -1 as string.
//Value must not be from 0 to 9. If yes, then return -2 as string.
//If value is a palindrome, then return true as string otherwise return false as string.
package oct28;

public class Pro_18checkPalindrome {
	String checkPalindrome(int num) {
		int rev=0,t=0,num1;
		num1=num;
		if(num<0)return"-1";
		else if(num<10)return"-2";
		else {
			while(num != 0)   
			{  
			int remainder = num % 10;  
			rev = rev * 10 + remainder;  
			num = num/10;  
			} 			
		}
		if(num1==rev)return"true";
		
		return "false";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pro_18checkPalindrome pd= new Pro_18checkPalindrome();
		System.out.println(pd.checkPalindrome(121));
		
	}

}

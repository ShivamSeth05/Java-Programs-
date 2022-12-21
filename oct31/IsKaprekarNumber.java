//
//Program-4
//----------
//Define a method which accepts an integer value as argument, return "True" in the form of string,
//if the given number is an kaprekar number, in other case return "False" in the form of string.
//
//Explanation:
//In mathematics, a Kaprekar number for a given base is a non-negative integer, 
//the representation of whose square in that base can be split into two parts that
//add up to the original number again. For instance, 45 is a Kaprekar number, 
//because 45² = 2025 and 20 + 25 = 45.
//For instance, 297 is a Kaprekar number, because 297² = 88209 and 88+209 = 297.
//
//Write the method with the following specifications: 
//
//Name of method : isKaprekarNumber()// accepts an integer value as argument, 
//return "True" if it is an kaprekar number, in other case return "False" in the form of string.
//Arguments: One argument of integer value.
//Return Type: A String value
//
//Specifications: The value returned by the method isKaprekarNumber() is determined by the following rules:
//
//If the given number is negative, return "-1" as string
//If the given number is zero, return "-2" as string
//in other case return "True" if it is a Kaprekar Number, else return "False".
//
//Example:
//Input: 9
//Output: "True"
//
//Input: 297
//Output: "True"
// 
//Input: 367
//Output: "False"
//  
//Input: -221
//Output: -1
//
//Input: 0
//Output: -2


package oct31;

public class IsKaprekarNumber {
	String isKaprekarNumber(int num) {
		if(num<0)return "-1";
		if(num==0)return "-2";
		int temp=num;
		int cnum ,c=0,rightsum=0,leftsum=0;
		num=(int)Math.pow(num, 2);
		cnum = num;
		while(num!=0) {
			c++;
			num=num/10;
		}
		if(c%2!=0)c++;
		int c1=(int)Math.pow(10, c/2);
		leftsum= cnum/c1;//  Left side
		rightsum= cnum%c1;//righ side

		if(rightsum+leftsum==temp) {
			return "True";
		}
	
		return "False";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsKaprekarNumber ob1 = new IsKaprekarNumber();
		System.out.println(ob1.isKaprekarNumber(297));

	}

}

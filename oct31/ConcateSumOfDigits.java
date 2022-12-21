////Program-2
//----------
//Write a method which accepts a double number and finds the sum of the digits to the left and
//right of the decimal point. It should return the sum as String in the following format 
//Left side sum:Right side sum
//
//Example:
//Input :120.520 
//Output: 3:7
//
//Define the below methods with the following specifications: 
//
//Name of method concateSumOfDigits()//accept double number and finds the sum of the digits to the left and right of the decimal point
//Arguments: One argument of double value.
//Return Type: an string value
//
//Example:
//Input :1205.5204 
//Output: 8:11


package oct31;

public class ConcateSumOfDigits {
	
	String getSumOfDigits( double num) {
		String Snum=String.valueOf(num);
		System.out.println(Snum);
		int i=0,s=0,s1=0,cn=0;
		    
	for(i=0;i<Snum.length();i++) {cn=i;
		if(Snum.charAt(i)=='.') {
			 break;
		}
		s =s+Character.getNumericValue(Snum.charAt(i));//left side Sum
	}
	
	while(cn!=Snum.length()-1) {
		cn++;
		s1 =s1+Character.getNumericValue(Snum.charAt(cn));//right side sum
	}
		return s +":"+s1;
	}

	public static void main(String[] args) {
		ConcateSumOfDigits as1 = new ConcateSumOfDigits();
		System.out.println(as1.getSumOfDigits(125.520));
	
	}

}

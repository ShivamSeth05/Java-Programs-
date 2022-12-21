//	Program-10
//	Define a method which accepts two value as arguments (an integer and boolean) 
//	and return the string indicating when the alarm should ring. 
//  The first argument indicating day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, 
//	and a boolean indicating if we are on vacation or not.
//	Write the method with the following specifications: 
//	Name of method ringAlarm() // which accepts two arguments, first indicating day of the 
//	week and second a boolean indiacting if we are on vacation.
//	Arguments: two arguments of type integer and boolean
//	Return Type: an string value 
//	Specifications: The value returned by the method ringAlarm() is determined by the following rules:
//	If the first argument value is not between 0 to 6, return "Invalid Inputs"
//	If the second value is not boolean value true or false, return "Invalid Inputs"

//	If the first argument value is between 1 to 5 indicating the week day's 
//  and second value is true indicating on vacation, return "10:00"

//	If the first argument value is between 1 to 5 indicating the week day's 
//	and second value is false indicating not on vacation, return "07:00"

//	If the first argument value is 0 or 6 indicating the weekend day's 
//	and second value is true indicating on vacation, return "OFF"

//	If the first argument value is 0 or 6 indicating the weekend day's 
//	and second value is false indicating not on vacation, return "10:00"


package oct27;

import java.util.Scanner;

class RingAlarm {
	String ringAlarm(int a,boolean b) {
		if(a<0 || a>6)return "Invalid Inputs";
		if(b!=true&& b!=false)return "Invalid Inputs";
		if(a>0&&a<6 && !b) return "07:00";
		if( b && a==0||a==6 ) return "OFF";
		if(!b && a==0||a==6  ) return  "10:00";
		return " ";			
	}
}
public class Pro_10_ringAlarm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RingAlarm rg = new RingAlarm();
		String s = rg.ringAlarm(5,false);
		System.out.println(s);
	}

}

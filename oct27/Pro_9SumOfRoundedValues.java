//Program-9
//Define a method which returns the sum of three rounded numbers. If the right most digit of the number is less than 5, then round off it's value to the previous multiple of 10 otherwise if the right most digit of the number is greater or equal to 5, then round off to the next multiple of 10. 
//Write the method with the following specifications: 
//Name of method sumOfRoundedValues() // which accepts three integer value as argument and return the sum of three rounded numbers.
//Arguments: three argument of type integer
//Return Type: an integer value 
//Example
//If a = 23, b = 34, c = 66
//   20 + 30 + 70 = 120
//If a = 23, b = 37, c = 55
//   20 + 40 + 60 = 120
//Specifications: The value returned by the method sumOfRoundedValues() is 
//determined by the following rules:
//If any of the given number is negative or zero, return -1.
//If any of the given numbers right most digit is of the number is lessthan 5,
//then round off its value to the previous multiple of 10 otherwise if the right
//most digit of the number is greater or equal to 5, then round off to the next multiple of 10. 
package oct27;
import java.util.Scanner;
public class Pro_9SumOfRoundedValues {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int x = Integer.parseInt(sc.nextLine());
		int y = Integer.parseInt(sc.nextLine());
		int z = Integer.parseInt(sc.nextLine());
	
		SumOfRoundedValues ob = new SumOfRoundedValues(); 	
		System.out.println( ob.sumOfRoundedValues(x, y, z));
	}
}
class SumOfRoundedValues{
	// 23 34 66 =120
	int rem1,rem2,rem3;
	int sumOfRoundedValues(int a ,int b, int c){
	if(a<1||b<1||c<1) return -1;
	rem1= a%10; rem2=b%10;rem3=c%10;
	 if(rem1<5) a=a-rem1;
	 	else {
		 if(rem1!=0) {
			 int temp=10-rem1;
			 a=a+temp;
		 }
	 	}
	 if(rem2<5)  b=b-rem2;
	 	else {
		 if(rem2!=0){
			 int temp=10-rem2;
			 b=b+temp;
		 }
	 	}
	 if(rem3<5)c=c-rem3;
	 else {
		 if(rem3!=0) {
			 int temp=10-rem3;
			 c=c+temp;
		 }
	 }System.out.println(a+ " "+ b+ " " + c);
	  return a+b+c;
	  
	}
}

//	Program-4
//	Define a method which returns the number it if it is an even number, 
//	if the number is odd then return the next multiple of 10.
//	Write the method with the following specifications: 
//	Name of method: oddRounder() // which accepts an integer value as argument
//	and return the same value if it is an even number, 
//	if the value is odd then return the next multiple of 10. 
//	Arguments: one argument of type integer
//	Return Type: an integer value 
//	Example if x = 24 then return 24, if x = 25 then return 30.
//	Specifications: The value returned by the method oddRounder() is determined by the following rules:
//	
//	If any of the given number is negative, return -1.
//	If any of the given number is zero, return -2.
//	If the given number is even, return the same number.
//	If the given number is odd, return the next multiple of 10.
		
package oct25;
class OddRounder{
	int oddRounder(int a) {
		if (a<0)
			return 0;
		else if(a==0)
			return -2;
		else if (a%2==0)
			return a;
		else {
			int rem=a%10;
			int t=10-rem;//7-10=3
			return a+t;
		}
	}
}
public class Program3Ifevennextmulof10 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		int a=17;
		OddRounder eveobj = new OddRounder();
		int res = eveobj.oddRounder(a);
		System.out.println(res);

	}
}

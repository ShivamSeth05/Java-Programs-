//Program-5
//Define a method which returns the 1 if the given number is positive, return -1 if the given number is negative, return 0 if the given number is 0.
//Name of method findSign() 
//Arguments: one argument of type integer
//Return Type: an integer value 
//Test Cases
//1.	If any of the given number is positive, return 1.
//2.	If any of the given number is negative, return -1.
//3.	If any of the given number is zero, return 0.

package oct26;
class FindSign{
	int findSign(int a){
		if(a>0)return 1;
		else if (a<0) return -1;
		return 0;
	}
}
public class Prog5_findSign {
	public static void main(String[] args) {
		FindSign obj = new FindSign();
		int a=-1;
		System.out.println(obj.findSign(a));
	}
}

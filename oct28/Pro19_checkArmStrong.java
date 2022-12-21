//Program-19
//Define a method which accepts a 4-digit value as number and checks whether 
//the number is armstrong or not.
//Armstrong number: An Armstrong number is an n-digit number that is equal
//to the sum of the nth powers of its digits.
//For this program we need 4-digit armstrong number and is calculated as
//Input: 1634 is a 4-digit armstrong number defined as
//	1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1634
//Write the method with the following specifications: 
//Name of method: checkArmStrong() // which accepts an integer value as
//argument and return the String as specified below.
//Arguments: one argument of type integer
//Return Type: a String value
//Specifications: The value returned by the method checkArmStrong() is 
//determined by the following rules:
//If the input value is negative, return "-1" as string.   
//If the input value is not a 4-digit number, return "-2" as string.                               
//If the input value is a 4-digit number and is an armstrong,
//return "ArmStrong Number" as string otherwise return "Not ArmStrong Number" as string. 
//Note: The string values you are returning are case sensitive.

package oct28;
public class Pro19_checkArmStrong{
	
    String checkArmStrong(int num){
    	int res=0, cnum=0;
    	if(num<0)return "-1";
    	else if(num>9999||num<999)return"-2";
    	else {
    		 cnum=num;
			while(num!=0) {
				int r=num%10; 
				res=res+(int)Math.pow(r,4); //27+125+1=153
				num=num/10; //1
			}
		}
    	if(cnum==res)return "ArmStrong Number";
    	return "Not ArmStrong Number";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pro19_checkArmStrong ob1=new Pro19_checkArmStrong();
		System.out.println(ob1.checkArmStrong(164));

	}

}

//Program-17
//Define a Method that checks for whether a given input is a prime number or not, and return a string.
//Write the method with following specifications
//Name of method: checkPrime
//Arguments: 1 Integer Argument 
//Return Type: A String value
//Value must not be negative. If yes, then return -1 as string.
//Value must not be 0 or 1. If yes, then return -2 as string.
//If value is a prime number, then return true as string otherwise return false as string.
package oct28;



public class Pro_17CheckPrime {
 	String checkPrime(int a){
 		boolean c = false;
 		if(a<0)return "-1";
 		else if(a<2)return "-2";
 		else {
 			for(int i=2;i<=a/2;i++) {
 				if(a%i==0) {
 					c=true;
 					break;
 				}
 				
 			}
 		}
 		if(!c)return "true" ;
 		else return"false";
 	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pro_17CheckPrime sd=new Pro_17CheckPrime();
		Pro_17CheckPrime sd1=new Pro_17CheckPrime();
		System.out.println(sd.checkPrime(7));
		System.out.println(sd.checkPrime(10));
	

	}

}

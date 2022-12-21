/*
Program-2
=========
A number is called an emirp number if we get another prime number on reversing the number itself.
 In other words, an emirp number is a number that is prime forwards or backward. 
 It is also known as twisted prime numbers. Write a program to 
 check whether a number is emirp number.
*/
package nov_01;


public class Pro_2_Emirpnumber {
	
	int prime(int number){
		for(int i=2;i<number/2;i++) {
			if(number%i==0) 
				return 0;	
		}
		return 1;
	}
	
	int rev(int number){
		int rev=0;
		while(number!=0) {
			int rem=number%10;
			rev=rev*10+rem;
			number=number/10;
		}
		return rev;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pro_2_Emirpnumber run = new Pro_2_Emirpnumber();
		int num=17;
		int revn,primen;
		int ckp=run.prime(num);
		if(ckp==1) {
			revn=run.rev(num);
			 primen=run.prime(revn);
			 if(primen==1)System.out.println("emirp");
			 else System.out.println("No emirp");
			 return ;
		}
		System.out.println("No emirp");
		
		
		
		

	}

}

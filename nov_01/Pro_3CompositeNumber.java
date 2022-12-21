//Program-3
//=========
//A Smith number is a composite number whose sum of digits equals to 
//the sum of digits of its prime factors, excluding 1.  
//Write a program to check whether a number is smith or not
//Eg. Suppose, we want to check the number 85 is smith or not. 
//Sum of digits = 8 + 5 = 13. Prime factors of 85 is: 5,17
//Sum of digits of its prime factors = 5 + 1+ 7 = 13
//Comparing the sum of digits with the sum of digits of 
//its prime factors i.e. 13=13. Both are equal. Hence, the given number (85) is a smith number.

package nov_01;

public class Pro_3CompositeNumber {
	int disgitSum(int a) {
		int rems=0;
		while(a!=0) {
			 rems=rems+a%10;
			 a/=10;
		}
		return rems;
	}//digitOfSum
	int prime(int number){
		for(int i=2;i<number/2;i++) {
			if(number%i==0) 
				return 0;	
		}
		return 1;
	}//checkPrime
	int primefact(int number){
		int s=0,in;
		Pro_3CompositeNumber ob1= new Pro_3CompositeNumber();
		for(int i=2;i<=number/2;i++) {
			if(number%i==0) {
				int t=ob1.prime(i);
				if(t==1) {
					in=i;
					if(in>9) in=ob1.disgitSum(in);
					s=s+in;
				}
			}	
		}
		return s;
	}
	public static void main(String[] args) {
		Pro_3CompositeNumber ob1= new Pro_3CompositeNumber();
		int a=85;
		int sumpfDigi=ob1.disgitSum(a);//13
		int primeFact=ob1.primefact(a);//13
		if(sumpfDigi==primeFact)
			System.out.println("smith number");
		else System.out.println("NOt smith number");
	}
}

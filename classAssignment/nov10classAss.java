package classAssignment;

class Ckp{
	String checkPalindrome(int num) {
		int rem,rev=0,dnum=num;
		if(num<0)return "-1";
		if(num<10)return "-2";
		while(dnum!=0) {
			rem=dnum%10;
			rev=rev*10+rem;
			dnum=dnum/10;
		}
		if(rev==num)return "True";
		return "false";
	}
}//checkPalindrome

class CkA{
	String checkArmStromg(int num) {
		int rem,sum=0,dnum=num;
		if(num<0)return "-1";
		if(num<1000||num>9999)return "-2";
		while(dnum!=0) {
			rem=dnum%10;
			sum=sum+(int)Math.pow(rem, 4);
			dnum=dnum/10;
		}
		if(sum==num)return "ArmStromg Number";
		return "Not ArmStromg Number";
	}
}//checkArmStromg

class CkF{
	int getFactorial(int num) {
		int fact=1;
		if(num<0)return -1;
		if(num==0)return -2;
		for(int i=1;i<num;i++) {
				fact=fact+(fact*i);		
		}
		return fact;
	}
}//getFactorial


class CkFs{
	String getFactors(int num) {
		String facts="";
		if(num<0)return "-1";
		if(num==0)return "-2";
		for(int i=1;i<=num/2;i++) {
			if(num%i==0)
				facts=facts+i + " ";	
		}
		return facts;
	}
}//getFactors

class CkEv{
	String getEvenNumber(int s_val , int endval) {
	
		String string="";
		int maxn,minn;
		maxn=s_val>endval?s_val:endval;
		minn=s_val<endval?s_val:endval;
		for(int i =minn;i<= maxn;i++ ) {
			if(i%2==0)
				string=string+i+" ";
		}
		return string;	
	}
}//getEvenNumber

public class nov10classAss {
	public static void main(String[] args) {
		Ckp ob1 = new Ckp();
		System.out.println(ob1.checkPalindrome(-5));
		System.out.println("===============================");
		CkA ob2 = new CkA();
		System.out.println(ob2.checkArmStromg(1634));
		System.out.println("===============================");
		CkF ob3 = new CkF();
		System.out.println(ob3.getFactorial(3));
		System.out.println("===============================");
		CkFs ob4= new CkFs();
		System.out.println(ob4.getFactors(6));
		System.out.println("===============================");
		CkEv ob5 = new CkEv();
		System.out.println(ob5.getEvenNumber(10, 20));
		
	}

}

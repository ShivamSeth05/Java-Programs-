package nov10;



class Ckps{
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
public class CkP {

	public static void main(String[] args) {
		Ckps ob1 = new Ckps();
		System.out.println(ob1.checkPalindrome(-5));
		

	}

}

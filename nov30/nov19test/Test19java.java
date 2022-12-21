package nov19test;

public class Test19java {
	
	void findNumber(int num ) {
		int dn=num,c=0,fd=0,ld=0,s1=0,s2=0;
		while(dn!=0) {
			c++;
			dn=dn/10;
		}
		fd=num/(int)Math.pow(10, c-1); 
		ld=num%10;
//		
		num=num-(fd*(int)Math.pow(10, c-1));
		num=num/10;
		while(num!=0) {
		int rem;
		rem=num%10;
		s1=s1+rem;
		num=num/10;
		}
		s2=fd+ld;
		if(s1==s2)System.out.println("Xylem NUmber");
		else System.out.println("Pholeyom NUmber");
			
		
	}

	public static void main(String[] args) {
		Test19java obTest19java = new Test19java();
		obTest19java.findNumber(12225);

	}

}

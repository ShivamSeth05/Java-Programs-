package classAssignment;

public class Third {
	int sumOfRoundValues(int a,int b,int c) {
		int r1,r2,r3,s=0;
		r1=a%10;
		if(r1<5) a=a-r1;
		else {
			int t=10-r1;
			a=a+t;
		}
		
		r2=b%10;
		if(r2<5) b=b-r2;
		else {
			int t=10-r2;
			b=b+t;
		}
		r3=a%10;
		if(r3<5) c=c-r3;
		else {
			int t=10-r3;
			c=c+t;
		}
		return a+b+c;
	}

	public static void main(String[] args) {
		Third ob = new Third();
		System.out.println(ob.sumOfRoundValues(23, 26, 30));
	}

}

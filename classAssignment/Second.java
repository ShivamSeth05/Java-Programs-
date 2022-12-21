package classAssignment;

public class Second {
	int sumOfMultiple(int a,int b,int c) {
		int r1,r2,r3,s=0;
		r1=a%10;
		if(r1>0) {
			int t=10-r1;
			a=a+t;
		}
		r2=b%10;
		if(r1>0) {
			int t=10-r2;
			b=b+t;
		}
		r3=c%10;
		if(r3>0) {
			int t=10-r3;
			c=c+t;
		}
		return a+b+c;
	}

	public static void main(String[] args) {
		Second ob = new Second();
		int rs = ob.sumOfMultiple(34, 74, 89);
		System.out.println(rs);

	}

}

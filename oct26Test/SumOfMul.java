package oct26Test;

public class SumOfMul {
	int sumOfMul(int num1,int num2,int num3) {
		int rem1,rem2,rem3;
		 rem1=num1%10;
		 rem2=num2%10;
		 rem3=num3%10;
		if(num1<1||num2<1||num3<1)return-1;
		else {
			if(rem1!=0) {
				int t=10-rem1;
				num1=num1+t;
		
			}
			if(rem2!=0) {
				int t=10-rem2;
				num2=num2+t;
			
			}
			if(rem3!=0) {
				int t=10-rem3;
				num3=num3+t;
				
			}
		}
		
		return num1+num2+num3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfMul ob1 = new  SumOfMul();
		System.out.println(ob1.sumOfMul(23,34,69));
		System.out.println(ob1.sumOfMul(23,34,50));
	}

}

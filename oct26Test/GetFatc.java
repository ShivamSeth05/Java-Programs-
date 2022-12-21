package oct26Test;

public class GetFatc {
	int getFatc(int num) {
		int i,sum=1;
		if(num<0)return -1;
		else if(num==0) return-2;
		else {
			for(i=num;i>1;i--) {
				sum=sum*i;
			}return sum;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetFatc ft1= new GetFatc();
		System.out.println(ft1.getFatc(6));

	}

}

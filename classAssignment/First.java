package classAssignment;

public class First {
	int calculate(int num) {
		if(num<1)return -1;
		if(num%2==0) {
			return num*num;
		}
		return num*num*num;
	}

	public static void main(String[] args) {
		First ob = new First();
		int rs = ob.calculate(3);
		System.out.println(rs);

	}

}

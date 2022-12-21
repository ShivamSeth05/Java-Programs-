package nov02;

public class Pro_1Jealous {
	
	String jealous(int num1,int num2){
		int gcd=0;
		for(int i=1;i<=num1&&i<=num2;i++) {
			if(num1%i==0&&num2%i==0)gcd=i;
		}
	//	System.out.println(gcd);
		if(gcd>1)
			
		return "Jealous";
		else return "Not Jealous";
		 
	}
	public static void main(String[] args) {
		Pro_1Jealous ob1= new Pro_1Jealous();
		System.out.println(ob1.jealous(10,33));
	}

}

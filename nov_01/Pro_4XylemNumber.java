/*
Program-4
==========
A number N will be a Xylem number if the sum of its extreme (first and last) 
digits is equal to the sum of mean (all digits except first and last) digits. 
If the sum of extreme digits is not equal to the sum of mean digits, 
the number is called Phloem number. Write a program to check whether a number is Xylem or Phloem

*/


package nov_01;

public class Pro_4XylemNumber {
	// 12348  12225 825122

	int conunt(int a) {
	int c=a;
	int firlastd=0,midd=0;
	while(c!=0) {
		if(c==a||c<10) {
			firlastd=firlastd+c%10;
		}else {
			midd=midd+c%10;
		}
		c=c/10;
	}
	if(firlastd==midd)return 1;
	return 0;
}
	

	public static void main(String[] args) {
		Pro_4XylemNumber ob1 = new Pro_4XylemNumber();
		int num=825122;
		int c=ob1.conunt(num);
		System.out.println(c);

	}

}

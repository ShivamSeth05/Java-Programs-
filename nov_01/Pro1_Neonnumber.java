/*
Program-1
=========
 A positive integer whose sum of digits of its square is equal to the number itself
 is called a neon number. For eg. 9. Write a program to print all neon numbers 
 between 1 and a given value.
*/

package nov_01;
// 9 81 9
public class Pro1_Neonnumber {
	void isNeonnumber(int range){
		int ns=0,sod=0;
		
		for(int i=0;i<=range;i++) {
			int cn=i*i;
			while(cn!=0){
				int r=cn%10;
				sod = sod +r;
				cn=cn/10;
				
			}
			if(sod==i)
				System.out.println(sod);
			sod=0;
			
		
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pro1_Neonnumber printneo = new Pro1_Neonnumber();
		printneo.isNeonnumber(10);
		
		

	}

}

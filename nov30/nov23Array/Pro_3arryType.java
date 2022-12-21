package nov23Array;

import java.util.Scanner;

class Sclass{
	int findType(int n, Integer ab[]) {
		int ev=0,od=0;
		for(int i=0;i<ab.length;i++) { //1 3 5 7  
			if(ab[i]%2==0)ev=1;	
			else od=1;
			
		}
			if(ev==1&&od==1)return 3;
			if(ev==1&&od==0)return 1;
			return 2;
		
		
	}
}
public class Pro_3arryType {
	

		public static void main(String[] args) {
			Scanner obs = new Scanner(System.in);
			System.out.println("Enter the size of array");
			int size= obs.nextInt();
			
			Integer obi[] = new Integer[size];//5
			
			for(int i=0;i<obi.length;i++) {
				obi[i]=obs.nextInt();
				}
			Sclass ob = new Sclass();
			int len =obi.length;
			int rs=ob.findType(len, obi);
			
			if(rs==1)System.out.println("Even Array ");
			else if (rs==2)System.out.println("odd Array");
			else System.out.println("Mix Array");
			
	}

}

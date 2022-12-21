package oct26Test;

public class Test3Cadbery {
	int test3Cadbery(int minL,int minB){
		int c=0;
		while (minL!=0 || minB!=0) {
			if(minL>minB) {
				minL = minL-minB;	
				c++;
			}
			else if(minL<minB) {
				minB =minB-minL;
				c++;
			}
			if(minL==minB) {
				c++;
				break;
				}
		}return c;
	}
	public static void main(String[] args) {
	int minL,maxB,minB,maxL;
		minL=5;maxB=9;
		minB=4;maxL=7;   
		int tc=0;
		Test3Cadbery cd = new Test3Cadbery();
		
		for(int i=minL;i<=maxB;i++) {
			for(int j=minB;j<=maxL;j++) {
				
				tc=tc+cd.test3Cadbery(i,j);
			}
		}
		System.out.println(tc);     
	}		
	
}

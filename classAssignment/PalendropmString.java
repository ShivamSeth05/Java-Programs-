package classAssignment;

public class PalendropmString {
	
	static boolean  pele(String str) {
		boolean b=false;
		int len=str.length()-1;
		for(int i=0;i<=len/2;i++) {
			if(str.charAt(i)==str.charAt(len-i)) 
				b=true;
			else {
				b=false;
				break;	
			}
				
			}return b;
	}
	
	static int  countvowel(String str) {

		int len=str.length()-1,c=0;
		for(int i=0;i<=len;i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') 
				c++;
			}
		return c;
	}

	public static void main(String[] args) {
		String str = "aba";
		System.out.println(pele(str.toLowerCase()));
		System.out.println(countvowel(str));

	}

}

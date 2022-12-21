package nov14;

import java.util.Scanner;

public class CountVowConNumetc {
	
	static void conutChar(String str) {
		int vo=0,con=0,digi=0,spc=0,sum=0;
		for(int i =0;i<=str.length()-1;i++) {
			char ch = str.charAt(i);
			if(ch=='a'||ch=='o'||ch=='i'||ch=='e'||ch=='u') {
				vo++;
			}
			else if(ch>='0'&&ch<='9') {
				
				digi++;
				sum = sum +Character.getNumericValue(ch);
							
			}
			else if(ch==' ') {
				spc++;
			}
			else if(ch!='a'||ch!='o'||ch!='i'||ch!='e'||ch!='u') {
				con++;
			}
		}
		System.out.println("\nVowels :"+vo+"\nconsonents : "+con+"\ndigit :"+digi+"\nspace :"+spc+"\nDigit of sum:"+sum);
	}//end of countChar

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String scString = new String(scanner.nextLine());
		conutChar(scString);
		scanner.close();

	}

}

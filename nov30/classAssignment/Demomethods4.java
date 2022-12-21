package classAssignment;

import java.util.Scanner;

class CheckBranch{
	boolean check(String b) {
		if(b.equals("CSE")||b.equals("EEE")||b.equals("ECE")) {
			return true;
		}
		return false;
	}
}
class Percentage{
	float calu(int num) {
		float per;
		per=num/6;
		return per;
	}
}
class Grade{
	
	String findg(Float num) {
		if(num>70)return "A";
		else if (num>60) return "B";
		else if (num>50) return "C";
		return "D";
			
	}
	
}
public class Demomethods4 {
	public static void main(String[] args) {
		Scanner ob1 = new Scanner(System.in);
		String name = "",bran="",grade="";
		int s1,s2,s3,s4,s5,s6,totalmarsk;
		float per=0;
		System.out.println("Enter Your Roll no [must be char]");
		String rollNo=ob1.nextLine();
		
		if(rollNo.length()==10) {
			System.out.println(rollNo);
			System.out.println("Enter Your Full name");
			name =ob1.nextLine();
			System.out.println(name);

			System.out.println("Enter Your Branch");
			bran =ob1.nextLine();
			CheckBranch ck = new CheckBranch();//obj  
			if(ck.check(bran)==true) {
				System.out.println(bran);
				System.out.println("Enter your Six Sub marks [1 -100]");
				s1 = ob1.nextInt();
				s2 = ob1.nextInt();
				s3 = ob1.nextInt();
				s4 = ob1.nextInt();
				s5 = ob1.nextInt();
				s6 = ob1.nextInt();
				
				if(s1>0&&s1<100&&s2>0&&s2<100&&s3>0&&s3<100&&s4>0&&s4<100&&s5>0&&s5<100&&s6>0&&s6<100) {
					totalmarsk=s1+s2+s3+s4+s5+s6;
					System.out.println(totalmarsk);
					Percentage cal = new Percentage();
					per=cal.calu(totalmarsk);
					System.out.println(per);
					Grade gd = new Grade();
					grade=gd.findg(per);
					System.out.println(grade);
					
				}//end of if subj
				else System.out.println("invalid marks");
				
			}//end of if branch
			else System.out.println("Branch Invalid!!!");
			
			
		}//end of roll no if block
		else System.out.println("invalid Roll NO!!!");
		
		System.out.println(rollNo+" || "+name+" || "+bran+" || "+per+" || "+grade);
	}//end of main
	
}

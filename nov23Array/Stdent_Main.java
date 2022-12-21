package nov23Array;

import java.util.Scanner;


public class Stdent_Main {

	public static void main(String[] args) {
		
		String rollno="",sname="",branch="",grade="";
		int sm1,sm2,sm3,sm4,sm5,sm6,totm;
		float sper;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of Student");
		int n =Integer.parseInt(sc.nextLine());//3
		String ob[] = new String[n];
		for(int i=0;i<n;i++) {
		
			System.out.println("Enter "+(i+1)+" Student Roll Number:");
			rollno=sc.nextLine();
			
			if(rollno.length()==10) {
				System.out.println("Enter Name:");
				sname=sc.nextLine();
				System.out.println("Enter Branch:");
				branch=sc.nextLine();
				StdentBarnch sb = new StdentBarnch();
				if(sb.verifybracnh(branch)) {
					System.out.println("Enter 6 Student marks:");
					sm1=Integer.parseInt(sc.nextLine());
					sm2=Integer.parseInt(sc.nextLine());
					sm3=Integer.parseInt(sc.nextLine());
					sm4=Integer.parseInt(sc.nextLine());
					sm5=Integer.parseInt(sc.nextLine());
					sm6=Integer.parseInt(sc.nextLine());
					if(sm1>0&&sm1<=100&&sm2>0&&sm2<=100&&sm3>0&&sm3<=100&&sm4>0&&sm4<=100&&sm5>0&&sm5<100&&sm6>0&&sm6<=100) {
						totm=(sm1+sm2+sm3+sm4+sm5+sm6);
						Student_per sp = new Student_per();
						sper=sp.calPer(totm);//400
						StudentGrade sg = new StudentGrade();
						grade=sg.calgrd(sper);
						
						ob[i]=sname+" | "+ rollno+" "+branch+" "+totm+" "+sper+" "+grade;
						totm=0;
						sper=0;
	//					StudentRead sr = new StudentRead(sname,rollno,);
					}else {System.out.println("Invalid Marks");ob[i]="Student "+(i+1)+"invalid details";}
					
				}//
				else {System.out.println("Invalid Branch");ob[i]="Student"+(i+1)+"invalid details";}
				
			}//end of roll
			else {System.out.println("Invalid rollnum");ob[i]="Student "+(i+1)+"invalid details";}
		}//end of loop
		System.out.println("\nStudents destils are : \n");
		for (String k: ob) {
			System.out.println(k);
			
		}
	}

}

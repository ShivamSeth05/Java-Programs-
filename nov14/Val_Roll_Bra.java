package nov14;

import java.util.Scanner;

public class Val_Roll_Bra {
	static boolean branch(String str) {
		if(str.equalsIgnoreCase("cse")||str.equalsIgnoreCase("eee")||str.equalsIgnoreCase("ese")){
		return true;
		}
		return false;
	}

	static boolean verfiyRoll(String str) {
		
		return true;
	}
		
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Read Branch");
		String branch = scanner.nextLine(),rollNum;
		if(branch(branch)) {
			System.out.println("Read Roll Number [Y18EEE1034]");
			rollNum=scanner.nextLine();
			if(rollNum.length()==9) {
				System.out.println(rollNum);
				verfiyRoll(rollNum);
			}else System.out.println("Invalid Roll no");
		}else System.out.println("Invalid Branch");

		scanner.close();

	}

}

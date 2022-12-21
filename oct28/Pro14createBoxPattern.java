//Program-14
//Define a method which accepts 2 numeric arguments and returns a box of 
//	the same size as a string with asterisk '*' symbol.
//Write the method with following specifications
//Name of method : createBoxPattern
//Arguments: 2 Integer Arguments // 1st argument represents Number of Rows.
//				// 2nd argument represents Number of Columns.
//Return Type: A String value
//Value must not be negative. If yes, then return -1 as string.                     
// Value must not be 0. If yes, then return -2 as string.                            
//1st value is rows and 2nd value is columns.
//Box must be created using star symbol separated using a single blank space
//For example, 1st value=4 & 2nd value=5 then output must be:-        
// *  *  *  *  *
// *           *
// *           *
// *  *  *  *  *

package oct28;

public class Pro14createBoxPattern {
String createBoxPattern(int rn ,int cn) {
	String s = "";
	if(rn<0||cn<0)return "-1";
	else if(rn==0||cn==0) return "-2";
	else {
		for(int r=1;r<=rn;r++) {// 6
			for(int c=1;c<=cn;c++) {// 1 2 3 4 5 6 
				if(r==1|| c==1||r==rn||c==cn)// 
					 s=s+"* ";
				else 
					s=s+"  ";
			}
			s=s+"\n";
		}
	}
	return s;
}
public static void main(String[] args) {
	Pro14createBoxPattern sc = new Pro14createBoxPattern();
	System.out.println(sc.createBoxPattern(6,6));
}
}

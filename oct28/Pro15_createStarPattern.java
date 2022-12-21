//Program-15
//Define a method which accepts 1 numeric argument and returns a String of stars (*).
//For instance if the given input is 3,then First line must have One star, Second Line Two stars, Third line Three Stars.  
//Write the method with following specifications
//Name of method: createStarPattern
//Arguments: 1 Integer Argument // Represents Number of Rows.
//Return Type: A String value
//Value must not be negative. If yes, then return -1 as string.                       
//Value must not be 0. If yes, then return -2 as string.                             
//Pattern must be created using star symbol separated by single blank space.
// Example:
//Input: 4
//Output:
// *
// *  *
// *  *  *
// *  *  *  *

package oct28;
public class Pro15_createStarPattern {
String createStarPattern(int rn ,int cn) {
	String s = "";
	if(rn<0||cn<0)return "-1";
	else if(rn==0||cn==0) return "-2";
	else {
		for(int r=1;r<=rn;r++) {// 6
			for(int c=1;c<=cn;c++) {// 1 2 3 4 5 6 
//				if(r==c|| c==1||r==rn)// 
				if(r>=c)
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
		Pro15_createStarPattern star = new Pro15_createStarPattern();
		System.out.println(star.createStarPattern(6 ,6));

	}

}

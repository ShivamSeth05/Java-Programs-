//Program-16
//Define a method which accepts 1 numeric argument and returns a pattern of numbers as a string.
//Write the method with following specifications
//Name of method: NumberPattern4
//Arguments: 1 Integer Argument // Represents Number of Rows.
//Return Type: A String value
//Value must not be negative. If yes, then return -1 as string.
//Value must not be 0. If yes, then return -2 as string.
//Value is rows.
//Pattern must be created using numbers separated by single blank space 
//Example:
//Input: 5
//Output:
//1
//2 4
//3 6 9
//4 8 12 16
//5 10 15 20 25
package oct28;

public class Pro_16NumberPattern4 {
	
	String numberPattern4(int n) {
		String s="";
		
		int i,j;
		for(i=1;i<=n;i++) { //1 
			for(j=1;j<=n;j++) { //1 2 3 4  
				if(i>=j)s=s+(i*j)+" ";
			}
			s=s+"\n";
		}
		return s;
	}
	public static void main(String[] args) {
		Pro_16NumberPattern4 ob1 = new Pro_16NumberPattern4();
		System.out.println(ob1.numberPattern4(8));

	}

}

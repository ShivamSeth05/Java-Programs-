/*
Program2:Reverse a string by word…
a. Write a program to create class ‘ReverseByWord’ with implemented main method.
b. Inside the main method create a String variable as follows

String text = “Industry Development And Training In Word Buzz A , Technologies I Naresh”;

c. Now Reverse the above String by Word and print it in console.
d. Try the above using java.util.StringTokenizer and java.util.Stack
e. Try the above without using java.util.StringTokenizer.


 */
package nov20_String;
import java.util.StringTokenizer;
public class Pro_02String {
	public static void main(String[] args) {
		
		String text = "Industry Development And Training In "
				+ "Word Buzz A Technologies I Naresh",tkn="",rev="";
		
		StringTokenizer ob = new StringTokenizer(text," ");
		while(ob.hasMoreTokens()) {
			tkn=ob.nextToken();
			for(int i =tkn.length()-1;i>=0;i--) {
				rev=rev+tkn.charAt(i);			
			}System.out.print(rev+" ");
			rev="";
		}
	}
}

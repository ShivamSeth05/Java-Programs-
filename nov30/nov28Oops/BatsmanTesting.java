/**
Program-2
=========
Class Batsman is given to you. Add below details to the class
1. Instance variables:
	name: String,
	runs: int,
	matches: int,
	batting_avg: float.
2. Create a default constructor that assigns default values to instance variables.
3. Create parameterized constructor that accepts name, runs, matches.
4. Create below methods,

	Method name: computeBattingAverage
	Return type: void
	
	This method should print the batting average of the batsman by dividing run with 
	matches.
	Input: "Sachin", 18000, 463
	Output: 

		Name: Sachin
		Batting_Avg: 38.87689

	Note: a. If runs or matches values are negative print 'Error'.
		  b. If runs are greater than 0 when matches are 0 print 'Error'.

	Method name: getStatistics
	Return type: void
	
	This method should print the details of the batsman.
	Input: "Sachin", 18000, 463
	Output: 
		Name: Sachin
		Runs: 18000
		Matches: 463

	Note: a. If runs or matches values are negative print 'Error'.
		  b. If runs are greater than 0 when matches are 0 print 'Error'.

Given a class Testing that contains main method. Use this class to test your code.

	Method name: showStatistics
	Return type: void
	
	This method should print the details of the batsman.
	Input: 
		name = "Sachin",
		wickets = 10,
		matches = 5,
		balls_bowled = 750,
		runs_conceded 463.
	Output: 
		Name=Sachin
		wickets=10
		matches=5
		balls_bowled=750
		runs_conceded=463

	Note: a. If any  values are negative print 'Error'.
		  b. If runs_conceded or balls_bowled are greater than 0 when matches are 0 print 'Error'.

	Method name: computeStrikeRate
	Return type: void
	
	This method should print the Strike Rate of the bowler by dividing runs_conceded with balls_bowled.
	Input: 
		name = "Sachin",
		wickets = 10,
		matches = 5,
		balls_bowled = 750,
		runs_conceded 463.
	Output: 

		Name: Sachin
		Strike_rate=0.61733335

	Note: a. If any values are negative print 'Error'.
		  b. If runs_conceded or balls_bowled are greater than 0 when matches are 0 print 'Error'.

	Method name: showStatistics
	Return type: void
	
	This method should print the details of the batsman.
	Input: "Sachin", 18000, 463
	Output: 
		Name=Sachin
		wickets=10
		matches=5
		balls_bowled=750
		runs_conceded=463

	Note: a. If any  values are negative print 'Error'.
		  b. If runs_conceded or balls_bowled are greater than 0 when matches are 0 print 'Error'.

Given a class BatsmanTesting that contains main method. Use this class to test your code.


 * 
 */
package nov28Oops;

import java.util.Scanner;

class Batsman{
	String name;
	int runs;
	int matches;
	float batting_avg;
	public Batsman() {
		name = null;
		runs = 0;
		matches = 0;
	}
	
	public Batsman(String name, int runs, int matches) {
		this.name = name;
		this.runs = runs;
		this.matches = matches;
	}
	void computeBattingAverage() {
		if(runs>=0&&matches>0) {
			batting_avg=(float)runs/matches;
			System.out.println("Bating Avg: " +batting_avg);
			}else System.out.println("Error");
		}
	void showStatistics() {
		if(runs>=0&&matches>0) {
			System.out.println("Name: "+name);
			System.out.println("Runs: "+runs);
			System.out.println("Matches: "+matches);
		}else System.out.println("Error");	
	}


}

public class BatsmanTesting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("name");
		String name = scanner.nextLine();
		System.out.println("Runs");
		int run= scanner.nextInt();
		System.out.println("matches");
		int mtc= scanner.nextInt();

		Batsman ob = new Batsman(name, run, mtc);
		System.out.println("--> Show Statistics <--");
		ob.showStatistics();
		System.out.println("--> Show BattingAverage <--");
		ob.computeBattingAverage();

	}

}

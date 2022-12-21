/*
Program-1
=========
Class Bowler is given to you. Add below details to the class
1. Instance variables:
	name: String,
	wickets: int,
	matches: int,
	balls_bowled: int,
	runs_conceded: int.
2. Create a default constructor that assigns default values to instance variables.
3. Create parameterized constructor that accepts name, wickets, matches, balls_bowled, runs_conceded.
4. Create below methods,
	Method name: computeBowlingAverage
	Return type: void
	This method should print the bowling average of the bowler by dividing runs_conceded with wickets.
	Input: 
		name = "Sachin",
		wickets = 10,
		matches = 5,
		balls_bowled = 750,
		runs_conceded 463.
	Output: 

		Name: Sachin
		bowling_avg=46.3  

Note: 
a. If any  values are negative print 'Error'.
b. If runs_conceded or balls_bowled are greater than 0 when matches are 0 print 'Error'.
Given a class BowlerTesting that contains main method. Use this class to test your code.
*/
package nov28Oops;

import java.util.Scanner;

class Bowler{
	String name;
	int wicket;
	int matches;
	int balls_bowled;
	int runs_conceded;
	Bowler(){
		name=null;
		wicket=0;
		matches=0;
		balls_bowled=0;
		runs_conceded=0;
	}
	Bowler(String name,int wicket,int matches,int balls_bowled,int runs_conceded){
		this.name= name;
		 this.wicket=wicket;
		this.matches=matches;
		this.balls_bowled=balls_bowled;
		this.runs_conceded=runs_conceded;
	}
	void computeBowlingAverage() {
		float avg;
		if(wicket>=0&&matches>0&&balls_bowled>=0&&runs_conceded>=0) {
				avg=(float)runs_conceded/wicket;
		System.out.println("Name:"+name);
		System.out.println("bowling_avg:"+avg);
		}else System.out.println("Error");
	
	}
//	void computeStrikeRate() {
//		float stk;
//		if(wicket>=0&&matches>0&&balls_bowled>=0&&runs_conceded>=0) {
//				stk=(float)runs_conceded/balls_bowled;
//		System.out.println("Name:"+name);
//		System.out.println("Strike rate:"+stk);
//		}else System.out.println("Error");
//	}
	void showStatistics() {
		if(wicket>=0&&matches>0&&balls_bowled>=0&&runs_conceded>=0)  {
			System.out.println("Name: "+name);
			System.out.println("Runs: "+wicket);
			System.out.println("Matches: "+matches);
			System.out.println("balls_bowled; "+balls_bowled);
			System.out.println("runs_conceded: "+runs_conceded);
		}else System.out.println("Error");	
	}
	
}
public class BowlerTesting {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("name");
		String name = scanner.nextLine();
		System.out.println("wickets");
		int wkt= scanner.nextInt();
		System.out.println("matches");
		int mtc= scanner.nextInt();
		System.out.println("balls_bowled");
		int ball_bow= scanner.nextInt();
		System.out.println("runs_conceded");
		int runcond= scanner.nextInt();
		
		
		Bowler ob = new Bowler();
		Bowler ob1 = new Bowler(name,wkt,mtc,ball_bow,runcond);
		System.out.println("--> show static <--");
		ob1.showStatistics();
//		ob.computeBowlingAverage();
		System.out.println("--> BowlingAverage <--");
		ob1.computeBowlingAverage();
//		System.out.println("--> StrikeRate <--");
//		ob1.computeStrikeRate();
		

	}

}

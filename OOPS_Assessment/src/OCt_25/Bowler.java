package OCt_25;

public class Bowler {
	private String name ;
	private int Wickete;
	private int matches;
	private int balls_bowled;
	private int runs_conceded;

	public void bowlerDetails(String name, int Wickete, int matches, int balls_bowled, int runs_conceded) {
		this.name = name;
		this.Wickete = Wickete;
		this.matches = matches;
		this.balls_bowled = balls_bowled;
		this.runs_conceded = runs_conceded;
	}
	//1. Method: computeBowlingAverage
	public void computeBowlingAverage() {
		if(Wickete>0 &&matches > 0 && runs_conceded>=0 && balls_bowled>=0) {
			double bowling_avg   = runs_conceded/(float)Wickete;
			System.out.println("Name: " + name);
			System.out.println("bowling_avg=" + bowling_avg);
		}
		else {
			System.out.println("Error");
		}

	}
	public void computeStrikeRate() {
		if(matches > 0 && runs_conceded >=0) {
			double strike_rate = runs_conceded/balls_bowled;
			System.out.println("Name: "+ name);
			System.out.println("strike_rate: "+ strike_rate );
		}
		else {
			System.out.println("Error");
		}
	}
	public void showStatistics() {
		if(matches > 0 && runs_conceded>0 && balls_bowled>0) {
			System.out.println("Name: "+ name);
			System.out.println("Wickete: "+ Wickete);
			System.out.println("Matches: "+ matches);
			System.out.println("Balls_bowled: "+ balls_bowled);
			System.out.println("Runs_conceded: "+ runs_conceded);
		}
		else {
			System.out.println("Error");
		}
	}
	public static void main(String[] args) {
		Bowler b = new Bowler();
		b.bowlerDetails("Abhishek", 2, 2, 2, 2);
		b.computeBowlingAverage();
		b.computeStrikeRate();
		b.showStatistics();

	}

}

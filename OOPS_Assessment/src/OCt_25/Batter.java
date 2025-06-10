package OCt_25;

public class Batter {
	String name ;
	int runs;
	int matches;
	int batting ;
	double batting_avg;

	public void batterDetails(String name, int runs, int matches,int batting, double batting_avg) {
		this.name = name;
		this.runs = runs;
		this.matches = matches;
		this.batting = batting;
		this.batting_avg = batting_avg;

	}
	public void computeBattingAverage() {
		if(runs<0 && matches<= 0 && matches==0 && runs >0 ) {
			System.out.println("ERROR");

		}else {
			batting_avg = runs/(double)matches;
			System.out.println("Name : "+name);
			System.out.println("Batting Avg: "+batting_avg);
		}
	}
	public void getStatistics() {
		if(runs<0 && matches<0 && matches==0 && runs>0) {
			System.out.println("Error");
		}else {
			System.out.println("Name: "+ name);
			System.out.println("Runs: "+ runs);
			System.out.println("Match: "+ matches);
			System.out.println("Batting: "+ batting);
			System.out.println("Batting Avg: "+ batting_avg);
		}
			
	}
	public static void main(String[] args) {
		Batter b = new Batter();
		b.batterDetails("Abhishek",25, 52, 55, 105);
		b.computeBattingAverage();
		b.getStatistics();
	}
}

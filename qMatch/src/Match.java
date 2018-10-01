
public class Match {
	
	String team1;
	String team2;
	Counter score1;
	Counter score2;

	public Match(String t1, String t2) {
		// TODO Auto-generated constructor stub
		 team1 = t1;
		 team2 = t2;
		score1 = new Counter(0);
		score2 = new Counter(0);
	}

	public void team1_score() {
		// TODO Auto-generated method stub
		score1.increment();
		
	}

	public void team2_score() {
		// TODO Auto-generated method stub
		score2.increment();
	}

	public void print_score() {
		// TODO Auto-generated method stub
		System.out.println(readTeam1Name() + readTeam1Score() + " || " + readTeam2Name() + readTeam2Score() );
	}
	
	
	public int readTeam1Score() {
		return score1.read_value();
	}
	
	public int readTeam2Score() {
		return score2.read_value();
	}
	
	public String readTeam1Name() {
		return team1;
	}
	
	public String readTeam2Name() {
		return team2;
	}
	
	

}


public class Team {
	int games_played, points;
	
	Team(){
		games_played = 0;
		points = 0;
	}
	
	public void win() { 
		games_played++;
		points+=3;
	}
	
	public void draw() { 
		games_played++;
		points++;
	}

	public void loss() { 
		games_played++;
	}
	
	public void print_details() { 
		
	}

	public void reset() { 
	games_played =0;
	points=0;
	}
	
	public int read_points() {
		return points;
		
	}
	
	public int read_games_played() {
		return games_played;
		
	}



}

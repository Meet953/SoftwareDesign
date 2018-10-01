 

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Team {
	
	Counter games_played;
	Counter points;
	String team_name;

	private JFrame frame;

 

	/**
	 * Create the application.
	 * @param j 
	 * @param i 
	 * @param string 
	 */
	 

	public Team(String name, int gp, int pt) {
		// TODO Auto-generated constructor stub

		team_name = name;
		games_played = new Counter(gp);
		points = new Counter(pt);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public int readPlayed() {
		// TODO Auto-generated method stub
		return games_played.read_value();
	}

	public int readPoints() {
		// TODO Auto-generated method stub
		return  points.read_value();
	}
	
	public String readName() {
		// TODO Auto-generated method stub
		return  team_name;
	}

	public void win() {
		// TODO Auto-generated method stub
		games_played.increment();
		points.increment();points.increment();points.increment();
		
	}

	public void draw() {
		// TODO Auto-generated method stub
		games_played.increment();
		points.increment();
		
	}

	public void loss() {
		// TODO Auto-generated method stub
		games_played.increment();
		
	}

	public void print_details() {
		// TODO Auto-generated method stub
		System.out.println("Team Name : " + readName() + " Games played : " + games_played.read_value() +" ||  Points : "+points.read_value()  );
	}

}

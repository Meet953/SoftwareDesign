import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MatchImpl extends UnicastRemoteObject implements Match {

	private int team1_score, team2_score;
    private String team1_name, team2_name;
    
	public MatchImpl(String t1, String t2) throws RemoteException 
	{   this.team1_name=t1;
	    this.team2_name=t2;
		this.team1_score=0;
		this.team2_score=0;
		}
	public void team1_goal()
	{
		this.team1_score++;

	}

	public void team2_goal()
	{
		this.team2_score++;

	}


	public String read_result()
	{
		String res="\n";
		res+= (team1_name+"    "+team2_name+"\n");
		res+= ("  "+team1_score+"       "+team2_score)+"\n\n";
		return res;
	}

}

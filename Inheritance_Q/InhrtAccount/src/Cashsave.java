
public class Cashsave extends Account {

	int max;
	public Cashsave(int n, int b, int m) {
		
		super(n,b);
		max = m;
		// TODO Auto-generated constructor stub
	}

	
	public boolean deposit(int amt) {
		// TODO Auto-generated method stub
		int famt = balance + amt;
		if(famt < max) {
			balance = famt;
			return true;
		}
		return false;
	}

	

}

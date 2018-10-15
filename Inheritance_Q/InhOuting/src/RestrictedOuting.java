
public class RestrictedOuting extends Outing {

	int max;
	
	public RestrictedOuting(int c, int m) {
		super(c);
		max = m;
		// TODO Auto-generated constructor stub
	}

	public int readCount() {
		// TODO Auto-generated method stub
		return count;
	}

	public boolean add() {
		// TODO Auto-generated method stub
		if(count < max ) {
			count+=1;
			return true;
		}
		else
		return false;
	}

	}

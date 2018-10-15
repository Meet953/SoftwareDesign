
public class MyCounter extends Counter {

	int upper_limit;
	
	public MyCounter(int v, int ul) {
		super(v);
		upper_limit = ul;
		// TODO Auto-generated constructor stub
	}

	public boolean increment() {
		// TODO Auto-generated method stub
		
		if (value<upper_limit) {value++; return true;}
        else  return false;
	
	}

	public int readLimit() {
		// TODO Auto-generated method stub
		return upper_limit;
	}
	
	

}

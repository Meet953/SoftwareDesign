
public class Account {

	String name;
	int number;
	int transactions;
	Money balance;
	
	public Account(String n, int no) {
		// TODO Auto-generated constructor stub
		name = n;
		transactions = 0;
		balance = new Money(0,0);
	}

	public String read_bal() {
		// TODO Auto-generated method stub
		return balance.read_value();
	}

	public String read_name() {
		return name;
	}
	
	public int read_transactions() {
		// TODO Auto-generated method stub
		return transactions;
	}

	public void deposit(int e1, int c1) {
		// TODO Auto-generated method stub
		balance.add(e1, c1);
		transactions++;
	}

	public boolean withdraw(int e1, int c1) {
		// TODO Auto-generated method stub
		if (balance.sub(e1, c1))
		{
			transactions++;
			return true;
			
		}
		
		return false;
		
	}

}

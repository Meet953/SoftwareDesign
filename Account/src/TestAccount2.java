
class Account2{
	public int balance=0;
      public Account2(int b){balance = b;}
	public void deposit(int amt){
		this.balance += amt;
	}
	public void  withdraw(int amt) throws AmtExceed100, InsuffBalance{
	
		if (amt>100)             { throw new AmtExceed100();  }
		else if (amt> balance)   { throw new InsuffBalance();  }
		     else                { balance -= amt;}
		
	}
	public int read_balance(){
		return this.balance;
	}
}


class AmtExceed100 extends Exception{
	public AmtExceed100() {super();}
}

class InsuffBalance extends Exception{
	public InsuffBalance() {super();}
}
	
public class TestAccount2{
public static void main(String [] args){
        Account2 a = new Account2(150);
        int amt[]={70, 120,85};
        for(int i=0;i<3;i++){
        	try {
        		 a.withdraw(amt[i]);
        		 System.out.println("Success");
        	}catch(AmtExceed100 e) {
        		System.out.println("Max withdrawl100");
        	}catch(InsuffBalance e2) {
        		System.out.println("Insuff Funds");
        	}
          
           /*if (resultCode==0)System.out.println("Success");
           if (resultCode==1)System.out.println("Max withdrawl100");   
           if (resultCode==2)System.out.println("Insuff Funds");*/
        }
	}}


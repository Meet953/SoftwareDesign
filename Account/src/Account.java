



	class Account{
		private int number;
		protected int balance;
		private int upperLimit;

        public Account(int n, int b,int l){number=n;
                                     balance=b;
                                     upperLimit=l;}
                
        public void withdraw(int amt) throws WithdrawException {
        	
			if (amt>balance) {
				throw new WithdrawException();
			}
			else {
				balance =  balance - amt;
			}
        }
        
        public void deposit(int amt) throws DepositException{
        	
			if (amt+balance>upperLimit) {
				throw new DepositException();
			}
		    else {   balance +=amt;
		    }
		 }
        
		public int read_balance()
		{
			return balance;
		}

	}


	class WithdrawException extends Exception{
		public WithdrawException() {super(); }
		
	}
	
class DepositException extends Exception{
	public DepositException() {super(); }
	}
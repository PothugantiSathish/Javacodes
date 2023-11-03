package second;

class BankAccount{
		
		int accountNo;
		int balance;
		String name;
		
		
		public BankAccount(int accountNo, int balance, String name) {
			this.accountNo = accountNo;
			this.balance = balance;
			this.name = name;
			
		System.out.println("New Account got Created on Name:"+name+" And with Opening Balance Amt:"+balance);
		}
		
		
		void depost(int amount) {
			
			this.balance = this.balance + amount;
			
			System.out.println(" Successfully deposited amount..."+amount);
			
		}
		
		void withDraw(int amt) {
			
			if(amt > this.balance) {
				System.out.println("Insufficient Amount");
			}
			else {
				this.balance = this.balance - amt;
				System.out.println("Successfully withdrawn Amount--->"+amt);
				
			}
		}
		
		void checkBalance() {
			System.out.println("Avialable Amount----->"+this.balance);
		}
		

	public static void main(String[] args) {
		
		 BankAccount sathishAcc = new BankAccount(124536,8000,"sathish");
			
			sathishAcc.checkBalance();
		
			sathishAcc.depost(2000);
			
			sathishAcc.checkBalance();
			
			sathishAcc.withDraw(6000);
			
			sathishAcc.checkBalance();
			
			sathishAcc.withDraw(30000);
			
			sathishAcc.checkBalance();
			

			
		}
		
	}



package com.uno.carrer;
class Person{
	String name;
	String aadharNo;
	String mobileNo;
	String address;
}

class Employee extends Person{
	int id;
	String orgName;
	int salary;
}
interface Bank{
	void deposit(int amt);
	void withDraw(int amt);
	void checkBalance();
}

class SBHBank implements Bank{
	int accno;
	String name;
	int balance;
	public SBHBank(int accno, String name, int balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public void deposit(int amt) {
		if(amt > 20000) {
			System.out.println("From SBHBank:::Daily u canot deposit >"+amt);
					
		}
		else {
			this.balance = this.balance + amt;
			System.out.println("From SBHBank:::Successfully deposited  amount..."+amt);
		}
	}
	@Override
	public void withDraw(int amt) {
		if(amt > 20000) {
			System.out.println("From SBHBank:::Daily u canot withdraw >"+amt);
					
		}
		else {
			this.balance = this.balance - amt;
			System.out.println("From SBHBank:::Successfully withDrawn  amount..."+amt);
		}
	}
	@Override
	public void checkBalance() {
		System.out.println("From SBHBank:::Available Balance---->"+this.balance);
			
	}
	
}



class HDFCBank implements Bank{
	int accno;
	String name;
	int balance;
	public HDFCBank(int accno, String name, int balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public void deposit(int amt) {
		this.balance = this.balance + amt;
		System.out.println("From HDFCBank:::Successfully deposited  amount..."+amt);
	}
	@Override
	public void withDraw(int amt) {
		this.balance = this.balance - amt;
		System.out.println("From HDFCBank::::Successfully withdrawn  amount..."+amt);
		
	}
	@Override
	public void checkBalance() {
		System.out.println("From HDFCBank::::Available Balance---->"+this.balance);
			
	}
	
}

public class BankAccounts {

	public static void main(String[] args) {
		Bank bank;

		bank = new SBHBank(14537,"Sathish",7000);
		
		bank.checkBalance();
		bank.deposit(2000);
		
		bank.checkBalance();
		bank.deposit(152000);
		bank.checkBalance();
		
		bank = new HDFCBank(12345,"Raju",20000);
		
		bank.checkBalance();
		bank.deposit(20000);
			
		bank.checkBalance();
		bank.deposit(355000);
		bank.checkBalance();
		
	}

}



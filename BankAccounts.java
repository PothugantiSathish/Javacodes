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

class SBIBank implements Bank{
	int accno;
	String name;
	int balance;
	public SBIBank(int accno, String name, int balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public void deposit(int amt) {
		if(amt > 20000) {
			System.out.println("From SBIBank:::Daily u canot deposit >"+amt);
					
		}
		else {
			this.balance = this.balance + amt;
			System.out.println("From SBIBank:::Successfully deposited  amount..."+amt);
		}
	}
	@Override
	public void withDraw(int amt) {
		if(amt > 20000) {
			System.out.println("From SBIBank:::Daily u canot withdraw >"+amt);
					
		}
		else {
			this.balance = this.balance - amt;
			System.out.println("From SBIBank:::Successfully withDrawn  amount..."+amt);
		}
	}
	@Override
	public void checkBalance() {
		System.out.println("From SBIBank:::Available Balance---->"+this.balance);
			
	}
	
}



class AxisBank implements Bank{
	int accno;
	String name;
	int balance;
	public AxisBank(int accno, String name, int balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public void deposit(int amt) {
		this.balance = this.balance + amt;
		System.out.println("From AxisBank:::Successfully deposited  amount..."+amt);
	}
	@Override
	public void withDraw(int amt) {
		this.balance = this.balance - amt;
		System.out.println("From AxisBank::::Successfully withdrawn  amount..."+amt);
		
	}
	@Override
	public void checkBalance() {
		System.out.println("From AxisBank::::Available Balance---->"+this.balance);
			
	}
	
}

public class BankAccounts {

	public static void main(String[] args) {
		Bank bank;

		bank = new SBIBank(14537,"Sathish",7000);
		
		bank.checkBalance();
		bank.deposit(2000);
		
		bank.checkBalance();
		bank.deposit(152000);
		bank.checkBalance();
		
		bank = new AxisBank(12345,"Raju",20000);
		
		bank.checkBalance();
		bank.deposit(20000);
			
		bank.checkBalance();
		bank.deposit(355000);
		bank.checkBalance();
		
	}

}



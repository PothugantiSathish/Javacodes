package spring.mvc;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankUser {
	
	@Id
	private int id;
	private String name;
	private long accno;
	private Double deposit;
	private String penaltystatus;
	private int penalty;
	private Double totalsalary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public Double getDeposit() {
		return deposit;
	}
	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}
	public String getPenaltystatus() {
		return penaltystatus;
	}
	public void setPenaltystatus(String penaltystatus) {
		this.penaltystatus = penaltystatus;
	}
	public int getPenalty() {
		return penalty;
	}
	public void setPenalty(int penalty) {
		this.penalty = penalty;
	}
	public Double getTotalsalary() {
		return totalsalary;
	}
	public void setTotalsalary(Double totalsalary) {
		this.totalsalary = totalsalary;
	}
	

}

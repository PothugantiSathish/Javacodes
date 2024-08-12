package spring.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //
public class BankService  {
	
	@Autowired //@Autowired //field injection 
	BankRepository bankRepo;
	
	public String saveUser(BankUser user) {
		
		String status=status(user.getDeposit());
		int penalty=penalty(user.getDeposit());
		double totalBal=balance(user.getDeposit());
		
		user.setPenaltystatus(status);
		user.setPenalty(penalty);
		user.setTotalsalary(totalBal);
		return bankRepo.saveUser(user);
		
	}

	private double balance(Double deposit) {
		
		return deposit+penalty(deposit);
	}

	private int penalty(Double deposit) {
		
		return (deposit<1000)? -15 : 10;
	}

	private String status(Double deposit) {
		
		return (deposit<1000.0)? "YES":"NO";
	}
	
	public BankUser getUser(int id) {
		return bankRepo.getUser(id);
	}
	
	public List<BankUser> getAll(){
		return bankRepo.getAll();
		
	}

}

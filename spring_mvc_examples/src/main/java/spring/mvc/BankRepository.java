package spring.mvc;

import java.util.List;

public interface BankRepository {//Crud operations in this class
	  
	  String saveUser(BankUser user);//save the data
	  BankUser getUser(int id);//get the data
	  List<BankUser>  getAll();//display all data
	  String updateUser(BankUser user);
	  String deleteUser(int id);

}

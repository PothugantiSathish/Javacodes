package second;

class Employee{
	
	String empID;
	String empName;
	int salary;
	String comName;
	
	public Employee(String empID, String empName, int salary, String comName) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
		this.comName = comName;
	}

	public Employee(String empID, String empName, String comName) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.comName = comName;
	}

	public Employee(String empID, String empName) {
		super();
		this.empID = empID;
		this.empName = empName;
	}
	

public static void main(String[] args) {
	
	Employee emp1 = new Employee("100","Abdul",57000,"IBM");
	Employee emp2 = new Employee("101","John");
	Employee emp3 = new Employee("102","Ramu","HP");
	
	
}
		
}






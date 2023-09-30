package com.uno.carrer;

import java.util.ArrayList;

class Student{
	
	int id;
	String name;
	String collegeName;
	float fee;
	int maths;
	int sco;
	int sci;
	
	public Student(int id, String name, String collegeName, float fee, int maths, int sco, int sci) {
		super();
		this.id = id;
		this.name = name;
		this.collegeName = collegeName;
		this.fee = fee;
		this.maths = maths;
		this.sco = sco;
		this.sci = sci;
	}

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

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public float getFee() {
		return fee;
	}

	public void setFee(float fee) {
		this.fee = fee;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getSco() {
		return sco;
	}

	public void setSco(int sco) {
		this.sco = sco;
	}

	public int getSci() {
		return sci;
	}

	public void setSci(int sci) {
		this.sci = sci;
	}

	public boolean failedMaths() {
		// TODO Auto-generated method stub
		return false;
	}
	
}

public class Colleges {
	public static void main(String[] args) {
		//50
	Student s1 = new Student(120,"Sathish","JNTUH",65000,70,80,85);	
	Student s2 = new Student(130,"Ramesh","CVR",25000,35,60,88);	
	Student s3 = new Student(300,"Ramu","HOLY",10000,30,52,75);	
	Student s4 = new Student(400,"Anil","VGD",1000,40,50,86);	
	Student s5 = new Student(500,"Naveen","SBIT",25000,79,25,65);
	
	ArrayList<Student> stuList = new ArrayList<Student>();
	
	stuList.add(s1);
	stuList.add(s2);
	stuList.add(s3);
	stuList.add(s4);
	stuList.add(s5);
	
	
	ArrayList<Student> failList = new ArrayList<Student>();
	ArrayList<Student> passList = new ArrayList<Student>();
	Student eachStu = null;
		
		for(int i=0;i<stuList.size();i++) {
			eachStu = stuList.get(i);
			if ( (eachStu.getMaths() > 50) &&(eachStu.getSci() > 50) &&(eachStu.getSco() > 50) ) {
				passList.add(eachStu);
			}
			else {
				failList.add(eachStu);
			}
		}// for
		
	
		System.out.println("Pass Student List--->");
		System.out.print("\nName\tCollegeName\tMaths\tScience\tSocial");
		for(int i=0;i<passList.size();i++) {
			eachStu = passList.get(i);
			System.out.print("\n"+eachStu.getName()+"\t"+eachStu.getCollegeName()+"\t\t"+
			eachStu.getMaths()+"\t"+eachStu.getSci()+
					"\t"+eachStu.getSco());
				
		}
		System.out.println("\nFailed Student List--->");
		System.out.print("\nName\tCollegeName\tMaths\tScience\tSocial");
		for(int i=0;i<failList.size();i++) {
			eachStu = failList.get(i);
			System.out.print("\n"+eachStu.getName()+"\t"+eachStu.getCollegeName()+"\t\t"+
			eachStu.getMaths()+"\t"+eachStu.getSci()+
					"\t"+eachStu.getSco());
				
		}
		ArrayList<Student> failedMathsList=new ArrayList<Student>();
		
		for(int i=0;i<stuList.size();i++) {
			eachStu =stuList.get(i);
			if(eachStu.getMaths() < 50) {
				failedMathsList.add(eachStu);
			}
		}

		System.out.println("\nStudents failed in maths");
		System.out.println("\nName\tCollegeName\tMaths");
		for(int i=0;i<failedMathsList.size();i++) {
			eachStu = failedMathsList.get(i);
			System.out.print("\n"+eachStu.getName()+"\t"+eachStu.getCollegeName()+"\t\t"+
					eachStu.getMaths());
			
		}
			
		
	}   

}

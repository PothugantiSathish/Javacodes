package com.uno.carrer;
//over loaded


class Method{
	
	void add(int a, int b) {
		System.out.println(a+b);
	}
	void add(int a, int b,int c) {
		System.out.println(a+b+c);
	}
	
	void add(String fname,String lname) {
		System.out.println(fname+" "+lname);
	}
	
}



public class MethodOverloading {

	public static void main(String[] args) {
		
		Method method = new Method();
		
		method.add(50, 60);
		method.add(120, 10,5);
		
		method.add("Sathish", "Anil");
		
	}

}



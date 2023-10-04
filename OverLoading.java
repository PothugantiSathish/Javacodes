package com.uno.carrer;
//is main method will have overloaded 

public class OverLoading {

	public static void main(String[] args) {
		System.out.println("Sathish");
		main();
		int[] x= {};
		main(x);
		char[] y= {};
		main(y);
		main(2,3);
		
	}

	public static void main() {
		System.out.println("Anil");
			
	}
	public static void main(int[] args) {
		
		System.out.println("Naveen");
	}
	public static void main(char[] args) {
		System.out.println("Hello");
		
	}
	public static void main(int a,int b) {
		
		System.out.println("Everyone");
	}
}



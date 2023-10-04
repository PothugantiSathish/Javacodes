package com.uno.carrer;

public class StringEven {

	public static void main(String[] args) {
		/*//Java String Program to Print even length words
		
				String str = "Welcome to Java World Good morning Hyderabad";
				
				String[] res = str.split(" ");
				
				for(int i=0;i<res.length;i++) {
					if(res[i].length() % 2 == 0) {
						System.out.println(res[i]);	
					}
					
				}
	}

}*/
		
		//Java String Program to Print even length words not using split
		
				String str = "Hii everyone lets start the class";
				
				String t = "";
				char ch;
			
				for(int i=0;i<str.length();i++) {
					ch = str.charAt(i);
					if(ch != ' ') t = t + ch;
					else if(ch == ' ') {
						if(t.length() % 2 == 0) {
							System.out.println(t);	
						}// if
						t="";
					}// else if
				}// for
	}
}

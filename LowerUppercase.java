package com.uno.carrer;

public class LowerUppercase {

	public static void main(String[] args) {
		/*char ch='B';
		// a--97
		// A--65+32--97
		System.out.println("Before conversion");
		
		System.out.println(ch);
		
		ch = (char)(ch + 32);
		System.out.println("After conversion");
		
		System.out.println(ch);
	}

}*/

		/*String str = "Hii Good Morning";
		//res----> Hii Good Morning
		char ch;
		String res = "";
		for(int i=0;i<str.length();i++) {
			ch = str.charAt(i);
			// 65--- 90----A-z
			if(ch >=65 && ch <=90) {// A-Z
				res = res +(char) (ch +32);
			}
			else if(ch >=97 && ch <=122) {// a-z
				res = res +(char) (ch - 32);
			}
			else {
				res = res + ch;
			}
		}// for
		
		System.out.println("Result--->"+res);
	}
}*/
		
		String data = "welcome to india. India is very Beautiful culture  country.I am Living In hyderabad";

		String str = "welcome";
		String res = "";
			if( (str.charAt(0) >=97) && (str.charAt(0) <=122)) {
				res = (char)(str.charAt(0) - 32)+str.substring(1);
			}
			
			System.out.println(res);
	}
}
	
	

		


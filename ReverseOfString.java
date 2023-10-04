package com.uno.carrer;

public class ReverseOfString {

	public static void main(String[] args) {
		//How to reverse a string in Java without using the reverse method?
		
				/*String str = "345678";
				
				char[] charArry = str.toCharArray();
				String res = "";
				
				for(int i=charArry.length-1;i>=0;i--) {
					res = res +charArry[i];
				}
				System.out.print(res);
				
				
				
	}

}
*/
		
				String str = "345678";
				
				String res = "";
				
				for(int i=str.length()-1;i>=0;i--) {
					res = res +str.charAt(i);
				}
				System.out.print(res);
	}
}
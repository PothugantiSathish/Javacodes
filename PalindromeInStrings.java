package com.uno.carrer;

public class PalindromeInStrings {

	public static void main(String[] args) {
       
		//palindrome
		String str = "123454321";
		String revStr = "";
		for(int i=str.length()-1;i>=0;i--) {    //int i=0;i<str.length();i++
			revStr = revStr + str.charAt(i);
		}
		if(str.contentEquals(revStr)) {
			System.out.println("String is Polyndrome");
		}
		else {
			System.out.println("String is Not  Polyndrome");
		}

	}

}
		/*//Java String program to check whether a string is a Palindrome
		String str = "131";
		boolean isPoly = true;
		for(int l=0,r=str.length()-1;l<str.length()/2;l++,r--) {
			if(str.charAt(l) != str.charAt(r)) {
				isPoly = false;
				break;
			}//if
		}// for
		if(isPoly == true) System.out.println("It is Polyndrome");
		else System.out.println("Not Polyndrome");
	}
}
*/
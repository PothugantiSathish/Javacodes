package com.uno.carrer;

public class WithoutUsingtemp {

	public static void main(String[] args) {
		// without using temporary variable 
			String str1 = "Pothuganti";
			String str2 = "Sathish";
		

			System.out.println("Before Swapping");
			System.out.println("STR1---->"+str1);
			System.out.println("STR2---->"+str2);
			
			
			str1 = str1 + str2;// "Pothuganti"+"Sathish"="PothugantiSathish"
			str2 = str1.substring(0, str1.length()-str2.length());//"Pothuganti"
			str1=  str1.substring(str2.length());
			
			
			System.out.println("After Swapping");
			
			System.out.println("STR1---->"+str1);
			System.out.println("STR2---->"+str2);
			
			
			
			
		}
	}



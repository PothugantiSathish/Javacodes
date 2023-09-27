package com.uno.carrer;

public class Largest {

	public static void main(String[] args) {
		int num[]= {4,5,6,-2,-12,0,2,1};
		int large=num[0];
		for(int i=0;i<num.length;i++) {
			if(large<num[i]) {
				large=num[i];
			}
		}
			System.out.println("largest number:"+large);
	}

}

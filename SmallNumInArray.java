package com.uno.carrer;

public class SmallNumInArray{

	public static void main(String[] args) {
		int[] num = {2,5,6,-10,-22,11,9};
		//-22
		
		int small = num[0];
		
		for(int i=1;i<num.length;i++) {
			
			if(small > num[i]) {
				small = num[i];
			}
		}
		
		System.out.println("smallest no---->"+small);

	}

}

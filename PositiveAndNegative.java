package com.uno.carrer;

import java.util.ArrayList;

public class PositiveAndNegative {

	public static void main(String[] args) {
		
		ArrayList numList = new ArrayList();
		
		numList.add(-1);
		numList.add(-2);
		numList.add(4);
		numList.add(8);
		numList.add(-5);
		numList.add(10);
		numList.add(-6);
		int PositiveSum=0,NegativeSum=0,num;
		for(int i=0;i<numList.size();i++) {
			num = (int)numList.get(i);
			if(num % 2 == 0) {
				PositiveSum = PositiveSum + num; 
			}
			else {
				NegativeSum = NegativeSum + num;	
			}
		}
		
		System.out.println("EvenSum---->"+PositiveSum);
		System.out.println("OddSum---->"+NegativeSum);
	}   
	}



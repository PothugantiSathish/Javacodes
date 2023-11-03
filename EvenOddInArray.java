package com.uno.carrer;
import java.util.ArrayList;
public class EvenOddInArray {

	public static void main(String[] args) {
		
		
				ArrayList numList = new ArrayList();
				// oddSum--28, evemSum---14
				numList.add(3);
				numList.add(5);
				numList.add(6);
				numList.add(8);
				numList.add(9);
				numList.add(11);
				int oddSum=0,evenSum=0,num;
				for(int i=0;i<numList.size();i++) {
					num = (int)numList.get(i);
					if(num % 2 == 0) {
						evenSum = evenSum + num; 
					}
					else {
					oddSum = oddSum + num;	
					}
				}// loop
				
				System.out.println("EvenSum---->"+evenSum);
				System.out.println("OddSum---->"+oddSum);
			}   
	}

		

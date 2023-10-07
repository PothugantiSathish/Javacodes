package com.uno.carrer;

import java.util.Scanner;

public class NumberOfBuildings {

	public static void main(String[] args) {
		        //SAMPLE INPUT
				//1
				//7 30
				//9 11 20 3 4 40 43...3buildings
		        //output-150
			
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter no of Test Cases");
					int t = sc.nextInt();
					
					for(int i=1;i<=t;i++) {
						System.out.println("Enter Total no of Buildings..");
						int b = sc.nextInt();
						System.out.println("Price of Commision for Each Building..");
						int p = sc.nextInt();
						
						
						
						int[] h = new int[b];
						System.out.println("Enter All .."+b+" buildings Heights....");
						
						for(int k=0;k<b;k++) {
							h[k]= sc.nextInt();
						}
						int res = printResult(h,p);
						System.out.println("Result--->"+res);
						
					}
						
					}

					private static int printResult(int[] h, int p) {
					
						int max = h[0],count=1;
						
						for(int i=1;i<h.length;i++) {
							if(h[i] > max) {
								max=h[i];
								count++;
							}// if
						}// for

						return count * p;
						
	}

}

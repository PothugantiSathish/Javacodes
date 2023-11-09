/*
		 * 
		 * Given an unsigned integer, swap all 0 bits with 1 bitsand 1 bit to 0. For example, 
		 * if the given number is 23 (10111),
		 * then 1000---8
		 
		 */


package uno.com.career;

public class ConvertBinaryNumber {

	public static void main(String[] args) {
		
				// 9 --- 1001
				// 0 --0
				// 1--1
				// 2 ---10
				// 3 ---11
				// 4 ---100
				// 5 ---101
				//
				
				int n =23,r,p=1,bn=0;
				
				while( n != 0) {
					r = n % 2;
					 n= n / 2;
					 bn = bn +r * p;
					 p = p * 10;
				}
				System.out.println("Binar number--->"+bn);
			}
}

			
			
			

		

	



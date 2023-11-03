package uno.com.career;

public class ArmStrongNumber {

	
//		int n=153,sum=0,r,t;
//		t=n;
//		while(n!=0) {
//			r=n%10;
//			sum=sum+r*r*r;
//			n=n/10;
//		}
//		
//		
//		if(sum==t) {
//			System.out.println("True");
//		}else {
//			System.out.println("False");
//		}
		
		

			static boolean isArmStrong(int n) {
				int ld,sum=0,t;
				t=n;
				while(n != 0) {
					ld = n % 10;
					n = n / 10;// 153  15 1 0
					sum = sum +ld * ld * ld;
				}
				//n=t;
				if(sum == t) {
					return true;
				}
				else {
					return false;
				}

				
			}
			
			
			public static void main(String[] args) {
			
				for(int i=1;i<=1000;i++) {
					if(isArmStrong(i) ==true) {
						System.out.print(i+" ");
					}
				}
			}
}

		
		
		

	



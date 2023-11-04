package uno.com.career;

public class Recursion {

		/*	static long fact(int n){
				long res = 1;
				for(int i=1;i<=n;i++) {
					res = res * i;
				}
				
				return res;
			}
			
			public static void main(String[] args) {
			
			// recursion
				
				int n =4;// 4!--- 4 * 3 * 2 * 1---24
				System.out.println("res----->"+fact(n));
				
			}

		}
*/
	
	
		static long fact(int n){// 1
			
			if(n == 1 ) return 1;
			else  return n * fact(n-1);// 4 * 3  
			// fact(3)---> 3 * 2 * 1
			// fact(2)---> 2 * fact(1)
			// fact(1)--->1
		}
		
		public static void main(String[] args) {
		
		// recursion
			
			int n =4;// 4!--- 4 * 3 * 2 * 1---24
			System.out.println("res----->"+fact(n));
			
		}

	}



	



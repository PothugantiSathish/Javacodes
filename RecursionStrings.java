package uno.com.career;

public class RecursionStrings {

		/*	static void display(int n) {
				if(n == 0) System.out.println("");
				else {
					System.out.println("Welcome");
					display(n-1);
				}
			}
			
			public static void main(String[] args) {
				display(5);
			}

		}*/
	
       //1*2*3*
       //use static keyword
       static void display(int n) {
    	   if(n == 6) System.out.println("");
			else {
				System.out.println("Welcome");
				display(n+1);
			}
    	   
       }
       public static void main(String[] args) {
			display(1);
       }
}


       

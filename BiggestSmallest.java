package bigger.smaller;

public class BiggestSmallest {

	public static void main(String[] args) {
		int n = 1234;
		int biggest  = 4;
		int smallest = 1;
		int r,sum=0;
		while(true) {
			r = n%10;
			sum = sum+r;
			sum++;
			
			System.out.println("sum...:"+sum);
			
		}
		
		
	}

}

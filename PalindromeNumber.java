package uno.career;

public class PalindromeNumber {

	public static void main(String[] args) {
		int n=12678,reverse=0,r;
		while(n>0) {
			r=n%10;
			reverse=reverse*10+r;
			n=n/10;
		}
		if(n==reverse) {
			System.out.println("palindrome number");
		}else {
			System.out.println("Not palindrome number");
		}
		
		
	}

}

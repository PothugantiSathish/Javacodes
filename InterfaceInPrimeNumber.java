package uno.com.career;

interface PrimeNumber{
	  
	  void isPrime(int num);
	  
}

public class InterfaceInPrimeNumber {

	public static void main(String[] args) {
		
		PrimeNumber PrimeNo= (num) ->{
			int count=0;
			for(int i=1;i<=num;i++) {
				if(num%i==0)
					count++;
			}
			if(count==2) {
				System.out.println("True");
			}else {
				System.out.println("false");
			}
		};
		PrimeNo.isPrime(7);
}
}

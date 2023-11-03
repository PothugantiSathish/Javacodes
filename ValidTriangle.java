package uno.career;

public class ValidTriangle {

	public static void main(String[] args) {
		
		int a=20,b=60,c=100,sum;
		sum=a+b+c;
		if(sum==180) {
			System.out.println("the triangle is valid");
		}
		if(sum>180) {
			System.out.println("the triangle is not valid");
		}
	}

}

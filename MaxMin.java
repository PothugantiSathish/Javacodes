package selection;

public class MaxMin {

	public static void main(String[] args) {
		int a=100,b=10,c=12,max,min;
		if(b > c) {
			max = b;
			min=c;
		}
		else {
			max=c;
			min=b;
		}
		if( a > max ) {
			max=a;
		}
		if( a < min) {
			min=a;
		}
		System.out.println("max....."+max);
		System.out.println("min....."+min);
	}

}



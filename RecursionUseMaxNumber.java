package uno.com.career;

public class RecursionUseMaxNumber {

	public static void main(String[] args) {
		int[] n= {120,2,3,4,5,6};
		int max=n[0];
		System.out.println(MaxNumber(n,n.length-1,max));	
	}

	private static int MaxNumber(int[] n, int size, int max) {
		if(size==0) {
			if(n[size]>max) {
				max=n[size];
			}
			return max;
		}
		else {
		if(n[size]>max) {
			max=n[size];
		}
		return MaxNumber(n,size-1,max);
	}
	}
}

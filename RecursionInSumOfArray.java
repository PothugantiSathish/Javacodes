package uno.com.career;

public class RecursionInSumOfArray {

	public static void main(String[] args) {
		int[] n= {1,2,3,4,5,6};
		// res ->21
		System.out.println(sumArr(n,n.length-1));
	}

	private static int sumArr(int[] n, int size) {
		if(size==0) return n[0];
		else return n[size]+sumArr(n,size-1);
	}
}

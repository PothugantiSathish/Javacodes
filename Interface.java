package uno.com.career;

interface Number{
	
	int add(int a,int b);
}

public class Interface {

	public static void main(String[] args) {
		
		Number nums =  (a,b)->{
			 return a+b;
		 };
		 
		 int res = nums.add(10,30);
		 System.out.println(res);
	}
}

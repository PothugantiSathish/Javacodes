package uno.com.career;

interface Numbers{
	int add(int a,int b);
}


class AddNum implements Numbers{

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}
	
}

			
public class FunctionalInterface {
			
			
			public static void main(String[] args) {
				
				AddNum adNo = new AddNum();
				
				int res = adNo.add(50, 20);
			
				System.out.println(res);
				
			}

		// functional interface
			
			
			

		}

	



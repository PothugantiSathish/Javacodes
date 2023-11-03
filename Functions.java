package second;

public class Functions {

	
	/*
	 * static void design(){ System.out.println("*********");
	 * System.out.println("----------");
	 * 
	 * }
	 * 
	 * public static void main(String[] args) { // 4 types // no params no return //
	 * params no return // no params return // params and return
	 * 
	 * design(); System.out.println("hii"); design();
	 * System.out.println("lets start"); design(); System.out.println("functions");
	 * design(); }
	 * 
	 * }
	 */
	//2)parameters and no return
/*static void design(String param1,String param2){
	System.out.println();
	for(int i=1;i<=10;i++) {
		System.out.print(param1);
	}
	System.out.println();
	for(int i=1;i<=10;i++) {
		System.out.print(param2);
	}
	System.out.println();
}

public static void main(String[] args) {
// 4 types
	// no params no return
	// params no return
	// no params return
	// params and return
	
	design("#",".");
	System.out.println("hii everyone");
	design("$","*");
	System.out.println("my name");
    design("$","*");
	System.out.println("is");
	design(".","@");
	System.out.println("sathish");
	design("@","-");
}
}*/
	
	//no parameters and return
	/*static float dollarToRupees(){
		float dollar = 78.57f;
		return dollar;
	}
	static String indiaCapital(){
		return "telangana";
	}
	public static void main(String[] args) {
		float rupees = dollarToRupees();
		System.out.println("dollar value in rupees---->"+rupees);
		
		String capital = indiaCapital();
		System.out.println("telangana state---->"+capital);
	}
}*/

	static float currencyToRuppes(String country,int currency){
		float res =0;
		if(country.equalsIgnoreCase("US")) {
			res = 80.57f * currency;
		}
		if(country.equalsIgnoreCase("SAD")) {
			res = 30.45f * currency;
		}
		return res;
	}
	
	static String countryCapital(String country){
		String res = "";
		if(country.equalsIgnoreCase("US")) {
			res = "Washington D.C";
		}
		if(country.equalsIgnoreCase("India")) {
			res = "Delhi";
		}
		return res;
	}

public static void main(String[] args) {
		float rupees = currencyToRuppes("US",100);
		System.out.println("dollar value in rupees---->"+rupees);
		
		rupees = currencyToRuppes("SAD",100);
		System.out.println("Saudi Dirams value in rupees---->"+rupees);
		
		
		String capital = countryCapital("US");
		System.out.println("USA Capital---->"+capital);
		
		
		capital = countryCapital("India");
		System.out.println("India Capital---->"+capital);
		
		
	}
}

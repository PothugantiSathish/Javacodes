package uno.com.career;

public class NonRepeatingNumber {

	public static void main(String[] args) {
		
//				 String str = "Swiss";
//				
//				 str = str.toUpperCase();
//				 char[] strArr = str.toCharArray();
//				 char eachChar;
//				 boolean isFound = false;
//				 char firstNonRepChar=' ';
//				 for(int i=0;i<strArr.length;i++) {
//					 eachChar = strArr[i];
//					 isFound = false;
//					for(int j=i+1;j<strArr.length;j++) {
//						if(eachChar == strArr[j]) {
//							isFound = true;
//							break;
//						}// if
//					}// for j
//					if(isFound == false) {
//						firstNonRepChar=eachChar;
//						break;
//					}// if
//				 }// for i
//			
//				 System.out.println("First Non Repeated Char--->"+firstNonRepChar);
		
		
		
		 // 10339093414
		 // 
		 // last repeated number 
		
		String str="10339093414";
		char eachchar;
		 char[] strArr = str.toCharArray();
		char lastRepeatingchar=' ';
		int count=0;
		for(int i=0;i<strArr.length;i++) {
			eachchar=strArr[i];
			count=0;
			for(int j=0;j<strArr.length;j++) {
				if(eachchar == strArr[j]) {
					count++;
				} //if
			}//for j
			if(count>1) {
				lastRepeatingchar=eachchar;
			}//if
		}//for i
		System.out.println(lastRepeatingchar);
			
				
				
	}
}
			
			
			
		
		
			
	



	



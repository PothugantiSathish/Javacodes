package uno.career;

public class Anagram {

	public static void main(String[] args) {
		String data = "listen";
		String data1 = "silent";
		boolean isAnagram = true;
		if(data.length()==data1.length()) {
			for (int i = 0; i < data.length(); i++) {
				boolean isfound = false;
				for (int j = 0; j < data1.length(); j++) {
					if (data.charAt(i) == data1.charAt(j)) {
						isfound = true;
						break;
					}
				}
				if (isfound ==false) {
					isAnagram = false;
					break;
				}
			}
			if(isAnagram==true) {
				System.out.println("is Anagram");
			}else {
				System.out.println("not Anagram");
			}
		}
		else {
			System.out.println("not a Anagram");
		}
		
	}
}

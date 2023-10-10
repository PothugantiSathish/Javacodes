package loops;

public class Powers {

	public static void main(String[] args) {
		for(int r=1;r<=5;r++) {
			int power=1;
			for(int c=1;c<=r;c++) {
				power=power*r;
			}
				System.out.println(power+"  ");
			}
		System.out.println();
		}

	}



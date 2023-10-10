package selection;

public class Rectangle {

	public static void main(String[] args) {
		
		int  length=5,width=3,area,perimeter;
		area =length*width;
		perimeter=2*(length+width);
		System.out.println("area="+area);
		System.out.println("perimeter="+perimeter);
		if(area<perimeter) {
			System.out.println("perimeter is greater than area");
		}
		
				
	}

}

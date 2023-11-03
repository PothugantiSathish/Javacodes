package second;

public class Arrays {
	
     //
	//public static void main(String[] args) {
		/*int[] a= {3,4,5,6,7};
		int[] b={1,2,5,6,8};
		int[] aAndb = new int[a.length];
		int resIndex=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i] == b[j]) {
					aAndb[resIndex]=a[i];
					resIndex++;
				}
			}
		}
		
		for(int i=0;i<resIndex;i++) {
			System.out.print(aAndb[i]+" ");
			
		}
	}

}*/
/*int[] a={1,2,3,600,700,900,1000};
int[] b={10,20,2,3,1,100,200,300,800,2000,3000,4000,5005,606,709};
// 1 2 3
int[] aAndb = new int[a.length];
int resIndex=0;
if ( (a.length > b.length)){
	for(int i=0;i<b.length;i++) {
		for(int j=0;j<a.length;j++) {
			if(b[i] == a[j]) {
				aAndb[resIndex]=b[i];
				resIndex++;
			}
		}
	}
}
else {
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<b.length;j++) {
			if(a[i] == b[j]) {
				aAndb[resIndex]=a[i];
				resIndex++;
}
		}
	}
}

for(int i=0;i<resIndex;i++) {
	System.out.print(aAndb[i]+" ");
	
}
	}
}
*/
		
		/*static void findAandB(int[] lower,int[] upper) {
			int[] aAndb = new int[lower.length];
			int resIndex = 0;
			for(int i=0;i<lower.length;i++) {
				for(int j=0;j<upper.length;j++) {
					if(lower[i] == upper[j]) {
						aAndb[resIndex]=lower[i];
						resIndex++;
					}// if
				}// j
			}// i
			
			for(int i=0;i<resIndex;i++) {
				System.out.print(aAndb[i]+" ");
				
			}
		}
		public static void main(String[] args) {
        int[] a={1,2,3,600,700,900};
		int[] b={10,20,2,3,1,5,7,8,};
		// 1 2 3
		if(a.length > b.length) {
			findAandB(b,a);
		}
		else {
			findAandB(a,b);
		}
		}
}*/

	/*public static void main(String[] args) {
	int[] A={2,4,6,8,9};
	int[] B={11,22,33,44,2,6};
	// AuB
	int[] AuB= new int[A.length+B.length];
	int index=0;
	for(int i=0;i<B.length;i++,index++) {
		AuB[index] = B[i];
	}
	// copy A elements into AuB
	boolean isFound = false;
	for(int i=0;i<A.length;i++) {
		// isFound for 1-----true
		for(int j=0;j<index;j++) {
			if(A[i] == AuB[j]) {
				isFound = true;
				break;
			}
		}
		if(isFound == false) {
			AuB[index] = A[i];
			index++;
}
		else {
			isFound= false;
		}
	}
	System.out.println("AuB Elements.....");
	for(int i=0;i<index;i++) {
		System.out.print(AuB[i]+" ");
	}
  }
}
*/
	//AuB elements
	
	/*static int[] A={10,20,4,5,6,7,8};
	static int[] B={1,24,5,6,8,9,10,4};
	static int index=0;
	static int[] AuB=new int[A.length+B.length];
	
	
	static void copy(int[] AuB,int[] source){
		for(int i=0;i<source.length;i++,index++) {
			AuB[index]= source[i];
		}
	}
	static void copyAnother(int[] AuB,int[] source){
		boolean isFound= false;
		for(int i=0;i<source.length;i++) {
			for(int k=0;k<index;k++) {
				
				if(source[i] == AuB[k]) {
					isFound = true;
					break;

				}// if
			}// k
			if(isFound == false) {
				AuB[index]= source[i];
				index++;
			}
			else {
				isFound = false;
			}
			
		}
	}
	public static void main(String[] args) {
		
		if(A.length > B.length) {
			copy(AuB,A);
			copyAnother(AuB,B);
		}
		else {
			copy(AuB,B);
			copyAnother(AuB,A);
		}
		System.out.println("AuB Elements.....");
		for(int i=0;i<index;i++) {
			System.out.print(AuB[i]+" ");
		}
	}
}*/
	//A-B elements
	public static void main(String[] args) {
		 int[] A={10,20,4,5,6,7,8};
		 int[] B={1,24,5,6,8,9,10,4};
		 int[] AminusB= new int[A.length];
		 int index=0;
			for(int i=0;i<A.length;i++) {
			boolean isFound=false;
			for(int j=0;j<B.length;j++) {
				if(A[i] == B[j]) {
					isFound = true;
					break;
					}
				}
			
			if(isFound == false) {
				AminusB[index] = A[i];
				index++;
			}
			else {
				isFound = false;
			}
	}

		System.out.println("A-B Elements.....");
		for(int i=0;i<index;i++) {
			System.out.print(AminusB[i]+" ");
		}
	  
	   }
	}
	//B-A elements
	/*public static void main(String[] args) {
		 int[] A={10,20,4,5,6,7,8};
		 int[] B={1,24,5,6,8,9,10,4};
		 int[] BminusA= new int[B.length];
		 int index=0;
			for(int i=0;i<B.length;i++) {
			boolean isFound=false;
			for(int j=0;j<A.length;j++) {
				if(B[i] == A[j]) {
					isFound = true;
					break;
					}
				}
			
			if(isFound == false) {
				BminusA[index] = B[i];
				index++;
			}
			else {
				isFound = false;
			}
	}

		System.out.println("B-A Elements.....");
		for(int i=0;i<index;i++) {
			System.out.print(BminusA[i]+" ");
		}
	  
	   }
	}*/
	
		
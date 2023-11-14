package second;

class Product {
		int ProductId;
		String ProductName;
		int ProductPrice;
		String ProductBrand;

	public Product(int productId, String productName, int productPrice, String productBrand) {
			
			this.ProductId = productId;
			this.ProductName = productName;
			this.ProductPrice = productPrice;
			this.ProductBrand = productBrand;
		}
	public Product(int productId, String productName, int productPrice) {
		
		this.ProductId = productId;
		this.ProductName = productName;
		this.ProductPrice = productPrice;
	}
	public Product(int productId, String productName) {
		super();
		this.ProductId = productId;
		this.ProductName = productName;
	}
	public static void main(String[] args) {
		Product p1=new Product(101,"Chocalates",1000,"Dairy Milk");
		Product p2=new Product(102,"Biscuits",1000);
		Product p3=new Product(103,"Kinder joy");
		System.out.println(p1.ProductId+" "+p1.ProductName+" "+p1.ProductPrice+" "+p1.ProductBrand);
		System.out.println(p2.ProductId+" "+p1.ProductName+" "+p1.ProductPrice);
		System.out.println(p3.ProductId+" "+p1.ProductName);
		

	}

}

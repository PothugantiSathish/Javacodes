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
		

	}

}

package product;

public class Main {
	public static void main(String[] args) {
		Product product = new Product();
		product.setProductId(33);
		product.setProductName("Laptop");
		product.setPrice(100000);
		product.productDetails();
	}
}

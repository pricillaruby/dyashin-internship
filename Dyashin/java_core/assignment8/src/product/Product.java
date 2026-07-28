package product;

public class Product {
	private long productId;
	private String productName;
	private int price;
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void productDetails() {
		if(price > 0) {
			System.out.println("Product Id: "+productId+" "+"Product Name: "+productName+" "+"Price: "+price);
		}else {
			System.out.println("Price must be greater than zero");
		}
	}
}

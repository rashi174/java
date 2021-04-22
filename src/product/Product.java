package product;

public abstract class Product implements Taxable {

	public String name;
	public float cost;
	public int quantity;
	public ProductType type;

	public Product(String name, float cost, int quantity, ProductType type) {
		super();
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
		this.type = type;
	}

	public float getTotalAmount() {
		float taxPerItem = getTax();
		float totalTax = taxPerItem * quantity;
		return totalTax + cost;
	}

}

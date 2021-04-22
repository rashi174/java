package product;

public class ProductFactory {
	public static Product getProduct(ProductType type, String name, int quantity, float price) {
		Product product = null;
		switch (type) {
		case RAW:
			product = new RawProduct(name, price, quantity);
			break;
		case IMPORTED:
			product = new ImportedProduct(name, price, quantity);
			break;
		case MANUFACTURED:
			product = new ManufacturedProduct(name, price, quantity);
			break;
		default:
			break;
		}
		return product;
	}
}

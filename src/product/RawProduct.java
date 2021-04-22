package product;

public class RawProduct extends Product {

	public RawProduct(String name, float cost, int quantity) {
		super(name, cost, quantity, ProductType.RAW);
	}

	@Override
	public float evaluateTax(float taxPercentage) {
		float tax = cost * taxPercentage / 100;
		return tax;
	}

	@Override
	public float getTax() {
		return evaluateTax(12.5f);
	}

}

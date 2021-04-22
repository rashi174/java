package product;
public class ManufacturedProduct extends Product {

	public ManufacturedProduct(String name, float cost, int quantity) {
		super(name, cost, quantity, ProductType.MANUFACTURED);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float evaluateTax(float taxPercentage) {
		// TODO Auto-generated method stub
		float evaluatedTax = taxPercentage /100 * cost * quantity *(1 + 2 / 100 * cost);
		return evaluatedTax;
	}

	@Override
	public float getTax() {
		// TODO Auto-generated method stub
		return (evaluateTax(12.5f));
	}

}

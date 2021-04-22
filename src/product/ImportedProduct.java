package product;

public class ImportedProduct extends Product {

	public ImportedProduct(String name, float cost, int quantity) {
		super(name, cost, quantity, ProductType.IMPORTED);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float evaluateTax(float taxPercentage) {
		// TODO Auto-generated method stub
		float tax = cost * taxPercentage / 100;
		return tax;
	}

	@Override
	public float getTax() {
		// TODO Auto-generated method stub
		return evaluateTax(10f);
	}

	@Override
	public float getTotalAmount() {
		float taxPerItem = getTax();
		float totalTax = taxPerItem * quantity;
		float finalCost = totalTax + cost;
		// Adding surcharge to the cost
		if (finalCost <= 100)
			finalCost = finalCost + 5;
		else if (finalCost <= 200)
			finalCost = finalCost + 10;
		else
			finalCost = finalCost + evaluateTax(5f);
		return finalCost;
	}

}

package product;

public enum ProductType {

	RAW, IMPORTED, MANUFACTURED;

	public static ProductType getTypeOfProdcut(int type) {
		ProductType productType;
		switch (type) {
		case 1:
			productType = ProductType.RAW;
			break;

		case 2:
			productType = ProductType.IMPORTED;
			break;

		case 3:
			productType = ProductType.MANUFACTURED;
			break;

		default:
			productType = ProductType.RAW;
			break;
		}
		return productType;
	}

}

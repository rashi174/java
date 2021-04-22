
package validation;

import main.ConsoleMessage;

public class ProductPriceValidator implements Validatable {

	@Override
	public boolean validate(String input) throws Exception {
		float price = 0;
		try {
			price = Float.parseFloat(input);
			if (price < 0) {
				throw new Exception(ConsoleMessage.INVALID_NEGATIVE_PRODUCT_PRICE);
			}
		} catch (Exception e) {
			throw new Exception(ConsoleMessage.INVALID_PRICE);
		}
		return true;
	}

}

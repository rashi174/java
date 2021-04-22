package validation;

import main.ConsoleMessage;

public class ProductNameValidator implements Validatable {

	@Override
	public boolean validate(String input) throws Exception {
		if ((input.isEmpty()) || !input.matches("^[a-zA-Z]*$"))
			throw new Exception(ConsoleMessage.INVALID_PRODUCT_NAME);

		return true;
	}

}

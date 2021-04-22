package validation;

import main.ConsoleMessage;

public class ProductTypeValidator implements Validatable {

	@Override
	public boolean validate(String input) throws Exception {
		// TODO Auto-generated method stub
		if (!input.equals("1") && !input.equals("2") && !input.equals("3"))
			throw new Exception(ConsoleMessage.INVALID_PRODUCT_TYPE_CHOICE);

		return true;
	}

}

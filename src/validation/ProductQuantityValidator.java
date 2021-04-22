package validation;

import main.ConsoleMessage;

public class ProductQuantityValidator implements Validatable {

	@Override
	public boolean validate(String input) throws Exception {
		String regex = "\\d+";
		if (!input.matches(regex))
			throw new Exception(ConsoleMessage.INVALID_QUALITY_CHOICE);
		return true;
	}

}

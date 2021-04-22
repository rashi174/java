package validation;

import main.ConsoleMessage;

public class UserChoiceValidator implements Validatable {

	@Override
	public boolean validate(String input) throws Exception {
		// TODO Auto-generated method stub
		if (!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no") && !input.equalsIgnoreCase("y")
				&& !input.equalsIgnoreCase("n"))
			throw new Exception(ConsoleMessage.INVALID_CHOICE);
		return true;
	}

}

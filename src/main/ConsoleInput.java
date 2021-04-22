package main;

import java.util.Scanner;

import product.Product;
import product.ProductFactory;
import product.ProductType;
import validation.ProductNameValidator;
import validation.ProductPriceValidator;
import validation.ProductQuantityValidator;
import validation.ProductTypeValidator;
import validation.UserChoiceValidator;
import validation.Validatable;

public class ConsoleInput {

	private Scanner scanner;

	public ConsoleInput(Scanner scanner) {
		super();
		this.scanner = scanner;
	}

	public String getProductName() {
		System.out.print(ConsoleMessage.ASK_PRODUCT_NAME);
		String name = getInput(new ProductNameValidator());
		return name;
	}

	public int getProductQuantity() {
		System.out.print(ConsoleMessage.ASK_PRODUCT_QUANTITY);
		String quantity = getInput(new ProductQuantityValidator());
		return Integer.parseInt(quantity);
	}

	public float getProductPrice() {
		System.out.print(ConsoleMessage.ASK_PRODUCT_PRICE);
		String price = getInput(new ProductPriceValidator());
		return Float.parseFloat(price);
	}

	public ProductType getProductType() {
		System.out.print(ConsoleMessage.ASK_PRODUCT_TYPE);
		String type = getInput(new ProductTypeValidator());
		return ProductType.getTypeOfProdcut(Integer.parseInt(type));
	}

	public Product getProductFromConsole() {

		String name = getProductName();

		float price = getProductPrice();

		int quantity = getProductQuantity();

		ProductType type = getProductType();

		Product newProduct = ProductFactory.getProduct(type, name, quantity, price);

		return newProduct;
	}

	private String getInput(Validatable validator) {

		boolean isInputValid = false;
		String input = null;

		do {
			input = scanner.nextLine();
			try {
				isInputValid = validator.validate(input);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(ConsoleMessage.TRY_AGAIN);
				System.out.println(ConsoleMessage.SEPERATOR);
			}
		} while (!isInputValid);
		return input;
	}

	public boolean needMoreProducts() {
		System.out.println(ConsoleMessage.NEED_MORE_PRODUCTS);
		String choice = getInput(new UserChoiceValidator());
		if (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y")) {
			return true;
		}
		return false;
	}

}

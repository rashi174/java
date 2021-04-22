package main;

import java.util.ArrayList;
import java.util.List;

import product.Product;

public class ProductManager {

	/**
	 * Will take product details from user through console.
	 * 
	 * @param inputManager Instance of ConsoleInput to handle product input from
	 *                     console.
	 * @return list of all products entered by user.
	 */
	public static List<Product> getProducts(ConsoleInput inputManager) {

		ArrayList<Product> products = new ArrayList<>();

		System.out.println(ConsoleMessage.HEADING_OF_SYSTEM);

		do {
			System.out.println(ConsoleMessage.SEPERATOR);
			System.out.println(ConsoleMessage.ASK_TO_ENTER_DETAILS);
			products.add(inputManager.getProductFromConsole());
		} while (inputManager.needMoreProducts());
		return products;
	}

	public static void printBill(Product product) {
		System.out.println("\tName: " + product.name);
		System.out.println("\tQuantity: " + product.quantity);
		System.out.println("\tCost: " + product.cost);
		System.out.println("\tTax Per Item: " + product.getTax());
		System.out.println("\tFinal Price: " + product.getTotalAmount());
		System.out.println(ConsoleMessage.PLAIN_SEPERATOR);
	}

	public static void printProductsBill(List<Product> products) {
		System.out.println(ConsoleMessage.HEADING_FOR_SHOWING_DETAILS);
		System.out.println(ConsoleMessage.PLAIN_SEPERATOR);
		for (Product product : products) {
			printBill(product);
		}
	}
}

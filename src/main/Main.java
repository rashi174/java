package main;

import java.util.List;
import java.util.Scanner;

import product.Product;

public class Main {

	public static void main(String[] args) {

		// To handle input from console

		ConsoleInput inputManager = new ConsoleInput(new Scanner(System.in));

		List<Product> products = ProductManager.getProducts(inputManager);

		ProductManager.printProductsBill(products);

	}

}

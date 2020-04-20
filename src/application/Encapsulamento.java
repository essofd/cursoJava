
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Encapsulamento {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String nome = sc.nextLine();
		System.out.print("Price: ");
		double preco = sc.nextDouble();


		Product product = new Product(nome, preco);
		
		product.setName("Computer");
		System.out.println("Update Name: " + product.getName());
		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quant = sc.nextInt();
		product.addProducts(quant);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quant = sc.nextInt();
		product.removeProducts(quant);
		System.out.println();
		System.out.println("Updated data: " + product);
		sc.close();
	}
}

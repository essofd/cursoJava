package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Quartos;

public class Exercicio5Vetores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos quartos serão alugados?");
		int n = sc.nextInt();
		
		
		Quartos[] vect = new Quartos[10];

		for (int i = 0; i < n; i++) {
			System.out.println();
			sc.nextLine();

			System.out.println("Aluguel #" + (i + 1));
			System.out.print("Name:");
			String nome = sc.nextLine();

			System.out.print("Email:");
			String email = sc.nextLine();

			System.out.print("Quarto:");
			int nquarto = sc.nextInt();

			vect[nquarto] = new Quartos(nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados:");

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(i + ":" + vect[i].getNome() + ", " + vect[i].getEmail());
			}
		}
		sc.close();
	}
}

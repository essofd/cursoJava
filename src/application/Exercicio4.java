package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Exercicio4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		double valor=0.00;

		System.out.print("Enter account number: ");
		int numConta = sc.nextInt();
		System.out.print("Enter account holder: ");
		String name = sc.next();
		System.out.print("Is there na initial deposit (y/n)? ");
		char dep = sc.next().charAt(0);
		
		
		if (dep=='y') {
			System.out.print("Enter initial deposit value: ");
			valor=sc.nextDouble();
			
			account=new Account(numConta, name, valor);
		
		} else {
			
			account=new Account(numConta, name);
			
		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		
		System.out.println();
		System.out.print("Enter deposit value: ");
		valor=sc.nextDouble();
		account.deposit(valor);
		System.out.println("Updated account data: ");
		System.out.println(account);

		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		valor=sc.nextDouble();
		account.withdraw(valor);
		
		System.out.println("Updated account data: ");
		System.out.println(account);

		sc.close();
	}
}

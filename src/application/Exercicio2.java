package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class Exercicio2 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		Funcionario func=new Funcionario();
		
		System.out.print("Nome: " );
		func.name=sc.nextLine();
		
		System.out.print("Salario Bruto: ");
		func.salarioBruto=sc.nextDouble();
		
		System.out.print("Imposto: ");
		func.imposto=sc.nextDouble();
		
		System.out.println();
		System.out.println("Funcionario: " +func);
		System.out.println();
		System.out.print("Qual a porcentagem de incremento de salario? ");
		func.incrementaSalario(sc.nextDouble());
		System.out.println();
		System.out.println("Dados Atualizados: " +func);
		
		sc.close();

	}

}


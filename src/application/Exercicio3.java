package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Estudante;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Estudante est=new Estudante();
		
		System.out.println("Entrada");
		est.nome=sc.nextLine();
	    est.nota1=sc.nextDouble();
	    est.nota2=sc.nextDouble();
	    est.nota3=sc.nextDouble();
	    
	    double soma=est.somaNota();
	    System.out.printf("FINAL GRADE = %.2f%n", soma);
	    
	    if (soma>=60) {
	    	System.out.println("PASS");
	    } else {
	    	System.out.println("FAILED");
	    	System.out.println("MISSING " + est + " POINTS");
	    }
		

		sc.close();
	}
}

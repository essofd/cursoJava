package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Retangle;

public class Exercicio1 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		Retangle x=new Retangle();
		
		System.out.println("Entre com a largura e altura do Retangulo:");
		x.width=sc.nextDouble();
		x.height=sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n" ,x.area());
		System.out.printf("PERIMETRO = %.2f%n" ,x.perimeter());
		System.out.printf("DIAGONAL = %.2f%n" ,x.diagonal());
		
		
		sc.close();

	}

}

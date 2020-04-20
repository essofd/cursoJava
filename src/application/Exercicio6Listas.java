package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;

public class Exercicio6Listas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos Funcionarios serão registrados?");
		int n = sc.nextInt();
		
		
		 List<Funcionarios> list=new ArrayList<>();
		 

		 for (int i=1; i<=n; i++) {
			 System.out.println();
			 System.out.println("Empregado #" + i);	
			 System.out.print("Id:");
			 int id = sc.nextInt();
				
			 System.out.print("Name:");
			 sc.nextLine();
			 String name = sc.nextLine();
				
			 System.out.print("Salario:");
			 double salary = sc.nextDouble();
			 
			 list.add( new Funcionarios(id,name,salary)); 

		 }
		 
		 System.out.println();
         System.out.print("Entre com o ID do Funcionario que terá seu Salario aumentado: ");
         int id= sc.nextInt();
         sc.nextLine();
         
         
         
        Funcionarios emp=list.stream().filter(x -> x.getId()==id).findFirst().orElse(null); 
         
         if (emp==null) {
        	  System.out.print("Este ID não existe!");
        	 
         } else {
        	 System.out.print("Entre com a porcentagem: ");
             double porc= sc.nextDouble();
             emp.incrementaSalario(porc);	 
         }
         
         System.out.println();

 		System.out.println("Lista de empregados:");

 		for (Funcionarios obj : list) {

 			System.out.println(obj);

 		}


		sc.close();
	}

}

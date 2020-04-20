package entities;

public class Funcionario {
	
	 public String name;
	 public double salarioBruto;
     public double imposto;
     
     public double salarioLiquido() {
    	 
    	return salarioBruto-imposto;
     }

     public void incrementaSalario(double porcentagem) {
    	 salarioBruto+=(porcentagem*salarioBruto)/100;
     }
     
     public String toString() {
    	 return name + ", $ " + String.format("%.2f",salarioLiquido()); 
     }
}

package entities;

public class Estudante {
	
	public String nome;
	public double nota1, nota2, nota3;
	
	public double somaNota() {
		return nota1+nota2+nota3;
	}
	
	public double pontosFaltantes() {
		return 60-somaNota();
	}
	
	 public String toString() {
    	 return String.format("%.2f",pontosFaltantes()); 
     }

}

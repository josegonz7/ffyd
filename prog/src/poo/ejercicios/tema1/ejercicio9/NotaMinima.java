package poo.ejercicios.tema1.ejercicio9;

public class NotaMinima {
	private double nota1;
	private double nota2;
	
	public NotaMinima(double nota1, double nota2) {
		this.nota1 = nota1;
		this.nota1 = nota2;
	}
		
	public void getnumero1() {
			System.out.println(this.nota1);
	}
		
	public void setnumero1(double nota1) {
			this.nota1 = nota1;
	}
		
	public void getnota2() {
			System.out.println(this.nota2);
	}
		
	public void setnota2(double nota2) {
			this.nota2 = nota2;
	}
	
	public void calcularNotaNecesaria() {
 		double notanecesaria = (nota1*0.40) + (nota2*0.60);
 		System.out.printf("la nota necesaria es : %.2f \n", notanecesaria);
	}
	

}

package poo.ejercicios.tema1.ejercicio8;

public class DistanciaAbsoluta {
	private double numero1;
	private double numero2;
	
	public DistanciaAbsoluta(double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
		
	public void getnumero1() {
			System.out.println(this.numero1);
	}
		
	public void setnumero1(double numero1) {
			this.numero1 = numero1;
	}
		
	public void getnumero2() {
			System.out.println(this.numero2);
	}
		
	public void setnumero2(double numero2) {
			this.numero2 = numero2;
	}
	
	public void mostrarDistancia() {
 		double distancia = Math.abs(numero1-numero2);
 		System.out.printf("la distacia es : %.2f \n", distancia);
	}
	

}

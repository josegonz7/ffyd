package poo.ejercicios.tema1.ejercicio5;

public class CalcularNotaTest {
	private int correctas;
	private int incorrectas;
	private int blancas;
	
	
	public CalcularNotaTest(int correctas, int incorrectas, int blancas) {
		this.correctas = correctas;
		this.incorrectas = incorrectas;
		this.blancas = blancas;
	}
		
	public void getcorrectas() {
			System.out.println(this.correctas);
	}
		
	public void setcorrectas(int correctas) {
			this.correctas = correctas;
	}
		
	public void getincorrectas() {
			System.out.println(this.incorrectas);
	}
		
	public void setincorrectas(int incorrectas) {
			this.incorrectas = incorrectas;
	}
	public void getblancas() {
		System.out.println(this.blancas);
	}
	
	public void setblancas(int blancas) {
		this.blancas = blancas;
	}
	
	public void calcularNotaFinal() {
		int notafinal = correctas*5 + incorrectas*(-1) + blancas*0;
		System.out.printf("nota final: %.2f \n", notafinal);
	}
}

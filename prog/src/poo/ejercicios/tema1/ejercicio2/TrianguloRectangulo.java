package poo.ejercicios.tema1.ejercicio2;

public class TrianguloRectangulo {

	private double catetoA;
	private double catetoB;
	
	public TrianguloRectangulo(double catetoA, double catetoB) {
		this.catetoA = catetoA;
		this.catetoB = catetoB;
	}
		
	public void getcatetoA() {
			System.out.println(this.catetoA);
	}
		
	public void setcatetoA(double catetoA) {
			this.catetoA = catetoA;
	}
		
	public void getcatetoB() {
			System.out.println(this.catetoB);
	}
		
	public void setcatetoB(double catetoB) {
			this.catetoB = catetoB;
	}
		
	public void calcularHipotenusa() {
		double hipotenusa = (catetoA*catetoA) + (catetoB * catetoB);
		
		System.out.printf("hipotenusa: %.2f \n", hipotenusa);
		
	}
}

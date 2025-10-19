package tema1CasaE.ejercicio7;

public class NotaAlgoritmos {
	
	private double parcial1;
	private double parcial2;
	private double parcial3;
	private double examenFinal;
	private double trabajoFinal;
	
	
	
	public NotaAlgoritmos(double parcial1,double parcial2,double parcial3,double examenFinal,double trabajoFinal) {
		this.parcial1 = parcial1;
		this.parcial2 = parcial2;
		this.parcial3 = parcial3;
		this.examenFinal = examenFinal;
		this.trabajoFinal = trabajoFinal;
	}
	
	public void getParcial1() {
		System.out.println(this.parcial1);
	}

	public void setParcial1(double parcial1) {
		this.parcial1 = parcial1;
	}
	
	public void getParcial2() {
		System.out.println(this.parcial2);
	}

	public void setParcial2(double parcial2) {
		this.parcial2 = parcial2;
	}
	
	public void getParcial3() {
		System.out.println(this.parcial3);
	}

	public void setParcial3(double parcial3) {
		this.parcial3 = parcial3;
	}
	
	public void getExamenFinal() {
		System.out.println(this.examenFinal);
	}

	public void setExamenFinal(double examenFinal) {
		this.examenFinal = examenFinal;
	}
	
	public void gettrabajoFinal() {
		System.out.println(this.trabajoFinal);
	}

	public void setTrabajoFinal(double trabajoFinal) {
		this.trabajoFinal = trabajoFinal;
	}
	
	public void calcularNotaFinal() {
		double parcialesMedia = (this.parcial1 + this.parcial2 + this.parcial3) /3;
		double notaFinal = (parcialesMedia * 0.55) + (examenFinal * 0.30) + (trabajoFinal*0.15);

		System.out.printf("notaPonderada: %.2f \n", notaFinal);
		
	}
	
}


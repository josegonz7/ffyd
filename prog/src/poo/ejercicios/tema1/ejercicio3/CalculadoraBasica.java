package poo.ejercicios.tema1.ejercicio3;

public class CalculadoraBasica {
	private double numero1;
	private double numero2;
	
	public CalculadoraBasica(double numero1, double numero2) {
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

	public void mostrarOperaciones() {
		//suma
		double operacionsuma =numero1 + numero2;
		//resta
		double operacionresta = numero1 - numero2;
		//dividir
		double operaciondividir = numero1 / numero2;
		//multiplicacion
		double operacionmultiplicacion = numero1 * numero2;
		
		System.out.printf("resultadosuma: %.2f \n", operacionsuma);
		System.out.printf("resultadoresta: %.2f \n", operacionresta);
		System.out.printf("resultadodividir: %.2f \n", operaciondividir);
		System.out.printf("resultadomultiplicacion: %.2f \n", operacionmultiplicacion);
	}
}
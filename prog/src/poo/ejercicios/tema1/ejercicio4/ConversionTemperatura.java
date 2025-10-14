package poo.ejercicios.tema1.ejercicio4;

public class ConversionTemperatura {
	private double fahrenheit;
	
	public ConversionTemperatura(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
		
	public void getfahrenheit() {
			System.out.println(this.fahrenheit);
	}
		
	public void setfahrenheit(double fahrenheit) {
			this.fahrenheit = fahrenheit;
	}

	public void mostrarCelsius() {
		double GradosCelsius = (this.fahrenheit -32)/1.8;
		System.out.printf("resultado: %.2f \n", GradosCelsius);
	}
	
}

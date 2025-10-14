package poo.ejercicios.tema1.ejercicio10;

public class ConversionMegabytes {
	private double megabytes;
	
	public ConversionMegabytes(double megabytes) {
		this.megabytes = megabytes;
	}
		
	public void getmegabytes() {
			System.out.println(this.megabytes);
	}
		
	public void setmegabytes(double megabytes) {
			this.megabytes = megabytes;
	}
		
	public void mostrarConversiones() {
 		double cantidadbytes = megabytes * 1000000;
 		double cantidadgiga = megabytes * 0.001;
 		double cantidadkilo = megabytes * 1000;
 		System.out.printf("bytes : %.2f \n", cantidadbytes);
 		System.out.printf("gigabytes : %.2f \n", cantidadgiga);
 		System.out.printf("kilobytes : %.2f \n", cantidadkilo);
 		
 		
 		
	}
	

}

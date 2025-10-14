package poo.ejercicios.tema1.ejercicio10;

import java.util.Scanner;

public class ConversionMegabytesMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime los megabytes: ");
		double megabytes = sc.nextDouble();
		
		ConversionMegabytes c1 = new ConversionMegabytes(megabytes);
		c1.mostrarConversiones();
	}

}

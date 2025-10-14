package poo.ejercicios.tema1.ejercicio8;

import java.util.Scanner;

public class DistanciaAbsolutaMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el numero1: ");
		double numero1 = sc.nextDouble();
		
		System.out.println("Dime el num1ero2: ");
		double numero2 = sc.nextDouble();
		
		DistanciaAbsoluta c1 = new DistanciaAbsoluta(numero1, numero2);
		c1.mostrarDistancia();
	}

}


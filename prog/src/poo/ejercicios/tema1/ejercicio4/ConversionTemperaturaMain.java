package poo.ejercicios.tema1.ejercicio4;

import java.util.Scanner;

public class ConversionTemperaturaMain {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Dime los grados fahrenheit: ");
			double fahrenheit = sc.nextDouble();
			
			ConversionTemperatura c1 = new ConversionTemperatura(fahrenheit);
			c1.mostrarCelsius();
		}

	}


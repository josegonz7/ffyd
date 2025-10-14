package poo.ejercicios.tema1.ejercicio5;

import java.util.Scanner;

public class CalcularNotaTestMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantas correctas tienes: ");
		int correctas = sc.nextInt();
				
		System.out.println("Cuantas incorrectas tienes: ");
		int incorrectas = sc.nextInt();
				
		System.out.println("Cuantas blancas tienes: ");
		int blancas = sc.nextInt();
				
				
		CalcularNotaTest c1 = new CalcularNotaTest(correctas, incorrectas, blancas);
		c1.calcularNotaFinal();
			
		}

}

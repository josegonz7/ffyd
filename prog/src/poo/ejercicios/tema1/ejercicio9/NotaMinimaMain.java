package poo.ejercicios.tema1.ejercicio9;

import java.util.Scanner;

public class NotaMinimaMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime la nota del primer examen: ");
		double nota1 = sc.nextDouble();

		System.out.println("Dime la media deseada: ");
		double mediaDeseada = sc.nextDouble();
		
		NotaMinima nEx = new NotaMinima(nota1, mediaDeseada);
		nEx.calcularNotaNecesaria();
		
	}

}
package tema1CasaE.ejercicio7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime nota parcial1: ");
		double parcial1 = sc.nextDouble();
		
		System.out.println("Dime nota parcial2: ");
		double parcial2 = sc.nextDouble();
		
		System.out.println("Dime nota parcial3: ");
		double parcial3 = sc.nextDouble();
		
		System.out.println("Dime nota examenFinal: ");
		double examenFinal = sc.nextDouble();
		
		System.out.println("Dime nota trabajoFinal: ");
		double trabajoFinal = sc.nextDouble();
		
		NotaAlgoritmos n1 = new NotaAlgoritmos(parcial1, parcial2, parcial3, examenFinal, trabajoFinal);
		n1.calcularNotaFinal();

	}

}


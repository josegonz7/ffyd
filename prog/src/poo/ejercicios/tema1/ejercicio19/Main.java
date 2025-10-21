package poo.ejercicios.tema1.ejercicio19;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime cuantos doseuros tienes: ");
		int dosEuros = sc.nextInt();
	
		System.out.println("Dime cuantos uneuros tienes: ");
		int unEuro = sc.nextInt();
	
		System.out.println("Dime cuantos cent50 tienes: ");
		int cent50 = sc.nextInt();

		System.out.println("Dime cuantos cent20 tienes: ");
		int cent20 = sc.nextInt();

		System.out.println("Dime cuantos cent10 tienes: ");
		int cent10 = sc.nextInt();

		Monedero v1 = new Monedero(dosEuros, unEuro, cent50, cent20, cent10);
		v1.calcularTotalEuros();
		
	}

}

package Ejercicios;

import java.util.Scanner;

public class Ejercicioperasmanzanas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduzca las ventas de las manzanas del p`rimer trimestre: ");
		double manzanas1= sc.nextDouble();
		System.out.println("introduzca las ventas de las manzanas del segundo trimestre: ");
		double manzanas2= sc.nextDouble();
		System.out.println("introduzca las ventas de las pèras del p`rimer trimestre: ");
		double peras1= sc.nextDouble();
		System.out.println("introduzca las ventas de las pèras del segundo trimestre: ");
		double peras2= sc.nextDouble();
		
		double total = (peras1+peras2)*1.95 + (manzanas1+manzanas2)*2.35;
		System.out.printf("el impòrte total es %.2f $ \n", total);
		
	}

}

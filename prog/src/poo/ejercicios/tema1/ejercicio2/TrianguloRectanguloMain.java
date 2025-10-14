package poo.ejercicios.tema1.ejercicio2;

import java.util.Scanner;

public class TrianguloRectanguloMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el catetoA: ");
		double catetoA = sc.nextDouble();
		
		System.out.println("Dime el catetoB: ");
		double catetoB = sc.nextDouble();
		
		TrianguloRectangulo r1 = new TrianguloRectangulo(catetoA, catetoB);
		r1.calcularHipotenusa();
	}

}

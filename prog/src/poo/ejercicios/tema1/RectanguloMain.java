package poo.ejercicios.tema1;

import java.util.Scanner;

public class RectanguloMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("dime la base: ");
		
		double base = sc.nextDouble();
				
		System.out.println("dime la altura: ");
		
		double altura= sc.nextDouble();
		
		Rectangulo r1 = new Rectangulo(base, altura);
		r1.calcularPerimetroArea();

	}
	
}

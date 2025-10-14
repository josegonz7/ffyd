package poo.ejercicios.tema1.ejercicio6;

import java.util.Scanner;

public class TotalDescuentoMain {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Dime el total: ");
			double total = sc.nextDouble();
			
			TotalDescuento c1 = new TotalDescuento(total);
			c1.mostrarTotalConDescuento();
		}

	}


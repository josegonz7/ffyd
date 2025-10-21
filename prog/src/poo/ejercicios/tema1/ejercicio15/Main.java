package poo.ejercicios.tema1.ejercicio15;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime una cantidad de minutos: ");
		int minutos = sc.nextInt();

		TiempoSimple t1 = new TiempoSimple(minutos);
		t1.mostrarHorasMinutos();

	}

}

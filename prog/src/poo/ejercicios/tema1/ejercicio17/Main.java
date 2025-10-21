package poo.ejercicios.tema1.ejercicio17;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime una cantidad de segundos: ");
		int segundoSalida = sc.nextInt();
		
		System.out.println("Dime una cantidad de minutos: ");
		int minutoSalida = sc.nextInt();
		
		System.out.println("Dime una cantidad de horas: ");
		int horaSalida = sc.nextInt();
		
		System.out.println("Dime una cantidad tota de segundos: ");
		int tiempoTotalSegundos = sc.nextInt();

		ViajeCiclista v1 = new ViajeCiclista(segundoSalida, minutoSalida, horaSalida, tiempoTotalSegundos);
		v1.mostrarHoraLlegada();

	}

}


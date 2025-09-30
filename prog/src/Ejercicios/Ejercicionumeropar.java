package Ejercicios;

import java.util.Scanner;

public class Ejercicionumeropar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numero= sc.nextInt();
		boolean numero_par=(numero%2==0);
		System.out.printf("es un numero par: %b \n", numero_par);
	}

}

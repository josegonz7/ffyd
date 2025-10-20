package tema1Casa.ejercicio13;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("valor a");
		int a = sc.nextInt();
		
		System.out.println("valor b");
		int b = sc.nextInt();
		
		
		Intercambio i1 = new Intercambio(a, b);
		i1.intercambiar();
	}

}



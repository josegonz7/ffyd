package prog1;

import java.util.Scanner;

public class dsqfd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu edad: ");
		int edad = sc.nextInt();
		boolean edadlaboral = (edad >= 16 edad <=67);
		System.out.printf("tienes edad para trbajar: %b \n", edadlaboral);
	}

}

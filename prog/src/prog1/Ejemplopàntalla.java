package prog1;

import java.util.Scanner;

public class Ejemplopàntalla {
	public static void main(String[] args) {
	System.out.println("hola");
	Scanner pepe = new Scanner(System.in);
	System.out.println("como te llamas");
	String nombre = pepe.next();
	System.out.printf("hola %s \n", nombre);
	System.out.printf("cuantos años tienes");
	int edad= pepe.nextInt();
	System.out.printf("tienes %d años \n", edad);
	System.out.println("cuanto mides");
	double metros = pepe.nextDouble();
	System.out.printf("mido %d cm \n ", metros);
	//nextBoolean (true or false
	}
	
}

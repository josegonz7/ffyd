package Ejercicios;

import java.io.PrintStream;
import java.util.Scanner;

public class Ejerciciomayoredad {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduce tu edad: ");
	int edad= sc.nextInt();
	boolean mayoredad=(edad >=18);
	System.out.printf("eres mayor de edad: %b \n", mayoredad);
	}

}

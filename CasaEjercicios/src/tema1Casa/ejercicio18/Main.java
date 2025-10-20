package tema1Casa.ejercicio18;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("numero: ");
		int numero = sc.nextInt();
			
		NumeroInvertido i1 = new NumeroInvertido(numero);
		i1.invertirNumero();
	}

}


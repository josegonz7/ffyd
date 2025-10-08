package poo.diapositiva119.cuenta;

import java.util.Scanner;

public class CuentaMain {
	public static void main(String[] args) {
		CuentaCorriente  c1 = new CuentaCorriente ("22233333B", "datos");
		Scanner sc = new Scanner(System.in);
		double numero;
		System.out.println("cuanto saldo quieres ingresar");
		numero = sc.nextDouble();
		c1.ingresarSaldo(numero);
		System.out.println("cuanto saldo quieres sacar");
		numero = sc.nextDouble();
		c1.sacarDinero(numero);
		c1.mostrarInformacion();
		//c1.saldo;
		
		
	}

}
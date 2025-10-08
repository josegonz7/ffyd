package poo.ejercicios.tema1;

import java.util.Scanner;

public class Rectangulo {

	double base;
	double altura;

	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	Scanner sc = new Scanner(System.in);System.out.println("base: ");System.out.println("altura: ");

	public void getbase() {
		System.out.println(this.base);
	}
	
	public void setbase(double base) {
		this.base = base;
	}
	
	public void getaltura() {
		System.out.println(this.altura);
	}
	
	public void setaltura(double altura) {
		this.altura = altura;
	}
	
	public void calcularPerimetroArea() {
		double perimetro= (base +altura)*2;
		double area = base * altura;
		
	}
}
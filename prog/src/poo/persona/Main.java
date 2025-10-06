package poo.persona;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Persona p1 = new Persona();
	p1.nombre="pepe";
	p1.edad=28;
	p1.estatura=1.89;
	
	p1.saludar();
	System.out.println("edad:");
	System.out.println(p1.edad);
	p1.cumpliranyos();
	System.out.println(p1.edad);
	System.out.println("estatura:");
	System.out.println(p1.estatura);
	p1.crecer(0.02);
	System.out.println(p1.estatura);
	}

}

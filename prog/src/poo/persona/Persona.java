package poo.persona;

public class Persona {
	String nombre;
	double estatura;
	int edad;

	void presentarse() {

	}

	void saludar() {
		System.out.println("hola");

	}

	void imprimirnombre() {
		System.out.println("nombre");

	}

	void cumpliranyos() {
		edad++;
	}

	void crecer(double incremento){
		estatura = estatura + incremento;
		
	}
	
}

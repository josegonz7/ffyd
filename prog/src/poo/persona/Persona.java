package poo.persona;

public class Persona {
	String nombre;
	double estatura;
	int edad;

	static String diadelasemana= "Martes";
	
	Persona(String nombre, int edad, double estatura){
		this.nombre = nombre;
		this.edad =edad;
		this.estatura=estatura;
	}
	static void mostrardiasemana() {
		System.out.println("Hoy es" + diadelasemana);
	}
	
	void presentarse() {

	}

	void saludar() {
		System.out.println("hola, mi nombre es" +  this.nombre);
		System.out.println("y estamos a" + diadelasemana);
	}
	

	void saludar(String nombre) {
	System.out.println("hola" + nombre + ", mi nombre es" +  this.nombre);

	}

	
	
	void imprimirnombre() {
		System.out.println("nombre");

	}

	void cumpliranyos() {
		this.edad++;
	}

	void crecer(double incremento){
		this.estatura = estatura + incremento;
		
	}
	
}

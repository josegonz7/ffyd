package random;

public class Calificaciones {
	String nombre;
	double estatura;
	int edad;

	void presentarse() {

	}

	void saludar() {
		System.out.println("hola, mi nombre es" +  nombre);

	}
	

	void saludar(String otronombre) {
	System.out.println("hola" + otronombre + ", mi nombre es" +  nombre);

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
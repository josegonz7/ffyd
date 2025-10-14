package poo.ejerciciostema1;

public class EjercicioPersonaMain {

	public static void main(String[] args) {

		EjercicioPersona p1 = new EjercicioPersona("Manuel", 26);
		EjercicioPersona p2 = new EjercicioPersona("Pepe", 25);
		EjercicioPersona p3 = new EjercicioPersona("Bakambu", 31);
		EjercicioPersona p4 = new EjercicioPersona("Marc", 34);

		EjercicioPersona.mostrarTotalPersonas();
		EjercicioPersona.mostrarultimoNombre();
		EjercicioPersona.mostrarUltimaPersona();
		
		System.out.println(EjercicioPersona.ultimaPersona);
		
	}

}
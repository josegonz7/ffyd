package poo.ejercicios.tema1.ejercicio17;

public class ViajeCiclista {
	int horaSalida;
	int minutoSalida;
	int segundoSalida;
	int tiempoTotalSegundos; 
	
	public ViajeCiclista(int horaSalida, int minutoSalida, int segundoSalida, int tiempoTotalSegundos ) {
		this.horaSalida = horaSalida;
		this.minutoSalida = minutoSalida;
		this.segundoSalida = segundoSalida;
		this.tiempoTotalSegundos = tiempoTotalSegundos;
	}
	
	public void getHoraSalida() {
		System.out.println(this.horaSalida);
	}
	
	public void setHoraSalida(int horaSalida) {
		this.horaSalida = horaSalida;
	}
	
	public void getMinutoSalida() {
		System.out.println(this.minutoSalida);
	}
	
	public void setMinutoSalida(int minutoSalida) {
		this.minutoSalida = minutoSalida;
	}
	
	public void getSegundoSalida() {
		System.out.println(this.segundoSalida);
	}
	
	public void setSegundoSalida(int segundoSalida) {
		this.segundoSalida = segundoSalida;
	}
	
	public void getTiempoTotalSegundos() {
		System.out.println(this.tiempoTotalSegundos);
	}
	
	public void setTiempoTotalSegundos(int tiempoTotalSegundos) {
		this.tiempoTotalSegundos = tiempoTotalSegundos;
	}
	
	public void mostrarHoraLlegada() {
		int segundos= (this.horaSalida)*3600 + (this.minutoSalida)*60 + this.segundoSalida + this.tiempoTotalSegundos;
		int segundosllegada = segundos % 60; 
		int minutosllegada = (segundos / 60) % 60;
		int horasllegada = (segundos / 3600) %24;
		
		System.out.println("Son " + horasllegada + "h, " + minutosllegada + " minutos y " + segundosllegada + " segundos. ");

	}
}

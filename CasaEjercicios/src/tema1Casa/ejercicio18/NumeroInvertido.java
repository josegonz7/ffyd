package tema1Casa.ejercicio18;

public class NumeroInvertido {
	private int numero;
	
	public NumeroInvertido(int numero) {
		this.numero = numero;
	}
	public void getNumero() {
		System.out.println(this.numero);
	}
	public void setnumero(int numero) {
			this.numero = numero;
		}
	public void invertirNumero() {
		int primerNumero = numero /10;
		int segundoNumero = numero %10;
		int inverso = (segundoNumero*10) + primerNumero;
		
		System.out.println("numero invertido: " + inverso);
	}
}

	

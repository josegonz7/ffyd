package tema1Casa.ejercicio13;

public class Intercambio {
	private int a;
	private int b;

	public Intercambio(int a, int b) {
		this.a = a;
		this.b = b;
		
	}
	
	public void getA() {
		System.out.println(this.a);
	}

	public void setA(int a) {
		this.a = a;
	}
	
	public void getB() {
		System.out.println(this.b);
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public void intercambiar() {
		int intercambio1 = a;  
		this.a = b;
		this.b = intercambio1;
		
		System.out.println("valor a: " + a);
		System.out.println("valor b: " + b);
	}
	
}

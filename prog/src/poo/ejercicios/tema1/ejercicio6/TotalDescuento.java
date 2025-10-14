package poo.ejercicios.tema1.ejercicio6;

public class TotalDescuento {
	private double total;
	
	public TotalDescuento(double total) {
		this.total = total;
	}
		
	public void gettotal() {
			System.out.println(this.total);
	}
		
	public void total(double total) {
			this.total = total;
	}

	public void mostrarTotalConDescuento() {
		double totalcondescuento = total * 0.85;
		System.out.printf("total: %.2f \n", totalcondescuento);
	}
	
}


package poo.cuentacorriente;

public class CuentaCorriente {

	String nombreTitular;
	double saldo;
	String dni;

	CuentaCorriente (String dni, String nombreTitular) {
		this.dni= dni;
		this.nombreTitular=nombreTitular;
		this.saldo=0;
	}	
	
	void ingresarSaldo(double incremento) {
			this.saldo= this.saldo + incremento;
			
	}		
			
	void sacarDinero(double decremento)	{
		this.saldo = this.saldo - decremento;
		//System.out.println("cuanto dinero quieres sacar?");
		System.out.println("has retirado el dinero");
		
	}	
	void mostrarInformacion() {
		System.out.println("el NombreTitular es " + nombreTitular);
		System.out.println("tu dni es " + dni);
		System.out.println("tu saldo restante es " + saldo);
	

	}

}

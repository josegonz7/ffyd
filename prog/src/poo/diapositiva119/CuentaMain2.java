package poo.diapositiva119;

public class CuentaMain2 {

	public static void main(String[] args) {
		
		CuentaCorriente2 cc1 = new CuentaCorriente2("11111111A", "Vladi");
		cc1.mostrarInformación();
		cc1.ingresar(500000000);
		cc1.mostrarInformación();
		
		CuentaCorriente2 cc2 = new CuentaCorriente2("22122222B", "Octavio");
		cc2.mostrarInformación();
		cc2.retirar(50);
		cc2.mostrarInformación();
		
		
		
		

	}

}
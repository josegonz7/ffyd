package poo.ejercicios.tema1.ejercicio19;

import java.io.PrintStream;

public class Monedero {
	int dosEuros;
	int unEuro ;
	int cent50;
	int cent20; 
	int cent10; 
	
	public Monedero(int dosEuros, int unEuro, int cent50, int cent20, int cent10) {
		this.dosEuros = dosEuros;
		this.unEuro = unEuro;
		this.cent50 = cent50;
		this.cent20 = cent20;
		this.cent10 = cent10;
	}
	
	public void getDosEuros() {
		System.out.println(this.dosEuros);
	}
	
	public void setDosEuros(int dosEuros) {
		this.dosEuros = dosEuros;
	}
	
	public void getUnEuro() {
		System.out.println(this.unEuro);
	}
	
	public void setUnEuro(int unEuro) {
		this.unEuro = unEuro;
	}
	
	public void getCent50() {
		System.out.println(this.cent50);
	}
	
	public void setCent50(int cent50) {
		this.cent50 = cent50;
	}
	
	public void getCent20() {
		System.out.println(this.cent20);
	}
	
	public void setCent20(int cent20) {
		this.cent20 = cent20;
	}
	
	public void getCent10() {
		System.out.println(this.cent10);
	}
	
	public void setCent10(int cent10) {
		this.cent10 = cent10;
	}
	
	public void calcularTotalEuros() {
		int euros= (dosEuros*2) + (unEuro*1);
		int centimos= (cent50*50) + (cent20*20) + (cent10*10);
		System.out.printf("total: " + euros + " euros y " + centimos + " centimos");
	}
}

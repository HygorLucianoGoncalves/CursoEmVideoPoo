package aula02;

public class Caneta {
	String modelo;
	String cor;
	Double ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("Modelo " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("A ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada: " + this.tampada);
	}
	
	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Erro! não posso rabiscar");
		} else {
			System.out.println("Já estou rabiscando ");
		}
	}
	
	void tampar() {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada = false;
	}
}

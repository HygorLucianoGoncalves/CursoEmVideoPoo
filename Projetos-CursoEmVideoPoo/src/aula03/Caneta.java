package aula03;

public class Caneta {

	public String modelo;
	public String cor;
	private double ponta;
	protected int carga;
	protected boolean tampada;

	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("está tampada: " + this.tampada);
	}

	protected void rabiscar() {
		if (this.tampada == true) {
			System.out.println("ERRO! Não posso rabiscar");
		} else {
			System.out.println("ja estou rabiscando");
		}
	}

	protected void tampar() {
		this.tampada = true;
	}

	void destampar() {
		this.tampada = false;

	}
}

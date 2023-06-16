package aula03;

public class Caneta {

	public String modelo;
	public String cor;
	private Double ponta;
	protected int carga;
	protected boolean tampada;

	public void status() {
		System.out.println("Modelo " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("A ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada: " + this.tampada);
	}

	protected void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Erro! não posso rabiscar");
		} else {
			System.out.println("Já estou rabiscando ");
		}
	}

	protected void tampar() {
		this.tampada = true;
	}

	void destampar() {
		this.tampada = false;
	}
}

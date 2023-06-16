package aula04;

public class Caneta {

	private String modelo;
	private double ponta;
	private String cor;
	private boolean tampada;

	public Caneta(String modelo, String cor, Double ponta) { // ESSE EO METODO CONSTRUCT
		this.cor = cor;
		this.modelo = modelo;
		this.ponta = ponta;
		this.tampar();
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPonta() {
		return ponta;
	}

	public void setPonta(double ponta) {
		this.ponta = ponta;
	}

	public void tampar() {
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = false;
	}

	public void status() {
		System.out.println("SOBRE A CANETA: ");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("A cor: " + this.cor);
		System.out.println("A tampar esta: " + this.tampada);
	}
}

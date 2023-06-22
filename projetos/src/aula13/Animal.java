package aula13;

public abstract class Animal {

	// ATRIBUTOS
	protected double peso;
	protected int idade;
	protected int membros;
	
	// METODOS
	
	public abstract void emitirSom();
	
	public double getPeso() {
		return peso;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public int getMembros() {
		return membros;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setMembros(int membros) {
		this.membros = membros;
	}
	
	
}

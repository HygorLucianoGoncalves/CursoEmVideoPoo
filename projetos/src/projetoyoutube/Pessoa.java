package projetoyoutube;

public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected String sexo;
	protected double experiencia;
	
	public Pessoa(String nome, int idade,String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.experiencia = 0;
	}
	//  GET 
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public double getExperiencia() {
		return experiencia;
	}
	
	// SET
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void setExperiencia(double experiencia) {
		this.experiencia = experiencia;
	}
	
	@Override
	public String toString() {
		return "Pessoa{" + "Nome=" + nome + ", Idade=" + idade + ", sexo=" + sexo + ", experiencia=" + experiencia + "}";
	}	
}

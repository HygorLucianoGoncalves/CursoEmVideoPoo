package aula10;

public class Pessoa {
	// ATRIBUTOS
	private String nome;
	private int idade;
	private String sexo;
	
	// METODOS
	
	public void fazerAniv() {
		this.idade++;
	}
	
	// GET AND GET
	
	public int getIdade() {
		return idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void mostra() {
		System.out.println("------------");
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Sexo: " + getSexo());
		System.out.println("------------");
	}
	
	
}

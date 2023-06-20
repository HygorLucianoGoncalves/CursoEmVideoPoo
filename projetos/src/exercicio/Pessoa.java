package exercicio;

public class Pessoa {
	// ATRIBUTOS
	private String nome;
	private int idade;
	private String sexo;
	
	public Pessoa(String nome,int idade,String sexo) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
	}

	public void fazerAniver() {
		this.idade++;
		
	}
	public void info() {
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Sexo: " + getSexo());
		System.out.println("============");

	}

	// SET AND GET

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getSexo() {
		return sexo;
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
}

package aula11;

public abstract class Pessoa {

	// ATRIBUTOS
	private String nome;
	private int idade;
	private String sexo;

	// METODOS

	public void fazerAniversario() {
		this.setIdade(getIdade() + 1);
		;
	}

	// GET AND SET

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void mostraInfo() {
		System.out.println("------------");
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Sexo: " + getSexo());
		System.out.println("------------");
	}
}

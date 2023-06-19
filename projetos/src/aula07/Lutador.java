package aula07;

public class Lutador {

	// ATRIBUTOS
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

	public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em) {
		this.setNome(no);
		this.setNacionalidade(na);
		this.setIdade(id);
		this.setAltura(al);
		this.setPeso(pe);
		this.setVitorias(vi);
		this.setDerrotas(de);
		this.setEmpates(em);
	}

	// SET AND GET
	public String getNome() {
		return nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public double getAltura() {
		return altura;
	}

	public double getPeso() {
		return peso;
	}

	public String getCategoria() {
		return categoria;
	}

	public int getVitorias() {
		return vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	// SETS

	private void setNome(String nome) {
		this.nome = nome;
	}

	private void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	private void setAltura(double altura) {
		this.altura = altura;
	}

	private void setPeso(double peso) {
		this.peso = peso;
		setCategoria();
	}

	private void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "Inválido";
		} else if (this.peso <= 70.3) {
			this.categoria = "Leve";
		} else if (this.peso <= 83.9) {
			this.categoria = "Médio";
		} else if (this.peso <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Invalido";
		}
	}

	private void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	private void setEmpates(int empates) {
		this.empates = empates;
	}

	private void setIdade(int idade) {
		this.idade = idade;
	}

	private void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	// METODOS

	public void apresentar() {
		System.out.println("--------------------------------");
		System.out.println("Lutador: " + getNome());
		System.out.println("Origem: " + getNacionalidade());
		System.out.println(getIdade() + " anos");
		System.out.println(getAltura() + " m de altura");
		System.out.println("Pesando " + getPeso() + "Kg ");
		System.out.println("Ganhou: " + getVitorias());
		System.out.println("Perdeu: " + getDerrotas());
		System.out.println("Empatou: " + getEmpates());
	}

	public void status() {
		System.out.println("--------------------------------");
		System.out.print(this.getNome());
		System.out.println(" é um peso " + getCategoria());
		System.out.println(getVitorias() + " vitorias");
		System.out.println(getDerrotas() + " derrotas");
		System.out.println(getEmpates() + " empates");
	}

	public void ganharLuta() {
		this.setVitorias(this.getDerrotas() + 1);
	}

	public void perderLuta() {
		this.setDerrotas(getDerrotas() + 1);
	}

	public void empatarLuta() {
		this.setEmpates(getEmpates() + 1);
	}
}

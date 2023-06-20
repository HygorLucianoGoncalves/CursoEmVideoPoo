package aula11;

public class Aluno extends Pessoa {
	
	// ATRIBUTOS
	private int matricula;
	private String curso;
	
	// METODOS
	public void pagarMensalidade() {
		System.out.println("Pagando mesalidade do aluno");
	}
	
	// GET AND SET 
	
	public int getMatricula() {
		return matricula;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}

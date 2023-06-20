package aula11;

public class Professor extends Pessoa {

	private String especialidade;
	private double salario;
	
	public void receberAumento(int valorAumento) {
		this.setSalario(getSalario() + valorAumento); 
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
}

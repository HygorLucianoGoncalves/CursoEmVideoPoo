package aula10;

public class Professor extends Pessoa {
	// ATRIBUTOS
	private String especialidade;
	private double salario;
	
	//METODOS
	public void receberAum(double salario) {
		this.setSalario(getSalario() + salario );  
	}
	
	// GET AND SET 
	
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

package aula10;

public class Aula10 {

	public static void main(String[] args) {
	
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Cláudio");
		p4.setNome("Fabiana");
		
		p2.setCurso("Informática");
		p3.setSalario(2500.75);
		p4.setSetor("Estoque");
		
		//p1.receberAum(550.20); // Linhas erradas mãe não pode chama od metodos de filha e filha não pode usar metodo de filha;
		//p2.mudarTrabalho();
		//p4.cancelarMatr();
}
	
}

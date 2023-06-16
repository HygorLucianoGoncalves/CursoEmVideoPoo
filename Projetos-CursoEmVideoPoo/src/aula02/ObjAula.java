package aula02;

public class ObjAula {

	int data;
	String materia;
	double duracao;
	int alunosquevem;
	boolean salastatus;
	
	void MostraInfoAula() {
		System.out.println("Data da aula é no dia: " + this.data);
		System.out.println("Qual vai ser a Materia da aula: " + this.materia);
		System.out.println("Qual a duração da aula: " + this.duracao + "  minutos");
		System.out.println("Alunos que vem para a aula " + this.alunosquevem + " Alunos que vem");
	}
	
	void infosala() {
		if (this.salastatus == true) {
			System.out.println("Sala esta aberta tudo ok");
		} else {
			System.out.println("Sala esta fechada ");
		}
	}
}

package aula02;

public class TesteAulaObl {

	public static void main(String[] args) {
		
		ObjAula a1 = new ObjAula();
		
		a1.data = 10;
		a1.duracao = 50;
		a1.alunosquevem = 25;
		a1.materia = "Histotia";
		a1.salastatus = true;
		
		a1.MostraInfoAula();
		a1.infosala();
		
	}
	
}

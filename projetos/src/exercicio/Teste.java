package exercicio;

public class Teste {

	public static void main(String[] args) {
		 
		Pessoa p1 = new Pessoa("teste", 0, "M");		
		Livro l1 = new Livro("Pequeno seria", "joçao pequeno", 130, 0, p1);
		
		l1.abrir();
		l1.avançarPag();
		l1.avançarPag();
		l1.voltaPag();
		l1.detalhes();
		l1.folhear();
	}
}

package projetoyoutube;

public class ProjetoYouTube {
	public static void main(String[] args) {
		Video v[]= new Video[5];
		v[0] = new Video("Aula 1 de Poo");
		v[1] = new Video("Aula 03 de Poo Java");
		
		v[0].mostraInf();
		v[1].mostraInf();
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("jubileu", 22, "M", "Juba");
		g[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");
		
		g[0].mostra();
		g[1].mostra();
		
		
	}
}

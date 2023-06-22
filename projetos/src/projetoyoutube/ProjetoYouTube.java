package projetoyoutube;

public class ProjetoYouTube {
	public static void main(String[] args) {

		Video v[] = new Video[5];
		v[0] = new Video("Aula 1 de Poo");
		v[1] = new Video("Aula 03 de Poo Java");
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
		
		Visualizacao vis = new Visualizacao(g[0], v[0]);
		vis.avaliar(87.0);
		System.out.println(vis.toString());
	}
}

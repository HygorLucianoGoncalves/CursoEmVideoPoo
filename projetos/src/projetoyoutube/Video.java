package projetoyoutube;

public class Video implements acoesVideo {
	private String titulo;
	private int avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;

	public Video(String titulo){
		this.titulo = titulo;
		this.avaliacao = 1;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
		
	}
	// GET
	public String getTitulo() {
		return titulo;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public int getViews() {
		return views;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public boolean getReproduzindo() {
		return reproduzindo;
	}

	// SET

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

	
	
	@Override
	public void play() {
		this.setReproduzindo(true);
	}

	@Override
	public void pause() {
		this.setReproduzindo(false);
	}

	@Override
	public void like() {
		this.curtidas++;
	}
	
	public void mostraInf() {
		System.out.println("======================");
		System.out.println(this.getTitulo());
		System.out.println("O Video teve o total de views de : " + this.getViews());
		System.out.println("Avaliação e de :"  + this.getAvaliacao());
		System.out.println("O total de curtidas é " + this.getCurtidas());
		System.out.println("======================");
	}

}

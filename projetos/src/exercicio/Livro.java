package exercicio;

public class Livro implements Publicacao {

	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;

	public Livro(String tituloDoLivro, String autor, int totPag, int pagAtual, Pessoa leitor) {
		this.setTitulo(tituloDoLivro);
		this.setAutor(autor);
		this.setTotPaginas(totPag);
		this.setPagAtual(pagAtual);
		this.setAberto(false);
		this.setLeitor(leitor);
	}

	public void detalhes() {
		// mostra os detalhes do livros
		System.out.println("===== LIVRO =====");
		System.out.println("TITULO DO LIVRO: " + this.getTitulo());
		System.out.println("TOTAL DE PAGINA: " + this.getTotPaginas());
		System.out.println("PAGINA ATUAL: " + this.getPagAtual());
		this.getAberto();
		System.out.println("O leito do livro é: ");
		this.getLeitor().info();

	}

	// SET AND GET

	public String getTitulo() {
		return this.titulo;
	}

	public String getAutor() {
		return this.autor;
	}

	public int getTotPaginas() {
		return this.totPaginas;
	}

	public int getPagAtual() {
		return this.pagAtual;
	}

	public void getAberto() {
		if (this.aberto) {
			System.out.println("O livro está aberto");
		} else {
			System.out.println("O livro está fechado");
		}
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	// SET

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		this.setAberto(true);
	}

	@Override
	public void fechar() {
		this.setAberto(false);

	}

	@Override
	public void folhear() {
		for (int i = 0; i <= this.getTotPaginas(); i++) {
			System.out.println("Pagina: " + i);
		}
	}

	@Override
	public void avançarPag() {
		if (this.aberto) {
			if (getPagAtual() >= 0) {
				this.setPagAtual(getPagAtual() + 1);
			} else {
				System.out.println("Livro não tem PAG");
			}
		} else {
			System.out.println("O livro está fechando");
		}

	}

	@Override
	public void voltaPag() {
		if (this.aberto) {
			if (getPagAtual() >= 0) {
				this.setPagAtual(getPagAtual() - 1);
			} else {
				System.out.println("Livro não tem PAG");
			}
		} else {
			System.out.println("O livro está fechando");
		}

	}

}

package aula08;

import java.util.Random;

public class Luta {

	// ATRIBUTOS
	private Lutador desafiando;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;

	// METODOS

	public void marcaLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
			this.aprovada = true;
			this.desafiando = l1;
			this.desafiante = l2;
		}else {
			this.aprovada = false;
			this.desafiando = null;
			this.desafiante = null;
		}

	}

	public void lutar() {
		if (this.aprovada) {
			System.out.println("--- DESAFIANDO ---");
			this.desafiando.apresentar();
			System.out.println("--- DESAFIANTE ---");
			this.desafiante.apresentar();

			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			System.out.println("=============================");
			switch (vencedor) {
			case 0:
				System.out.println("Empatou");
				this.desafiando.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1:
				System.out.println("Vitoria do " + this.getDesafiando().getNome());
				this.desafiando.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2:
				System.out.println("Vitoria do " + this.getDesafiante().getNome());
				this.desafiando.perderLuta();
				this.desafiante.ganharLuta();
				break;
			}

		} else {
			System.out.println("Luta não pode acontencer");
		}
		System.out.println("=============================");

	}

	// GET AND SETS

	public Lutador getDesafiando() {
		return this.desafiando;
	}

	public Lutador getDesafiante() {
		return this.desafiante;
	}

	public int getRounds() {
		return this.rounds;
	}

	public boolean getAprovada() {
		return this.aprovada;
	}

	// SETS

	public void setDesafiando(Lutador desafiando) {
		this.desafiando = desafiando;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
}

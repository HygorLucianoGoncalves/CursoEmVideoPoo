package aula06;

public class ControleRemoto implements Controlador {

	// ATRIBUTOS
	private int volume;
	private boolean ligado;
	private boolean tocando;

	// METODOS ESPECIASIS

	// CONSTRUTOR
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	// GET AND SET

	public int getVolume() {
		return this.volume;
	}

	public boolean getLigado() {
		return this.ligado;
	}

	public boolean getTocando() {
		return this.tocando;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean setLigado(boolean ligado) {
		return this.ligado = ligado;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	// METODOS DA INTEFACE CONTROLADOR
	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		System.out.println("--------- MENU --------");
		if (getLigado()) {System.out.println("O controle esta: LIGADO ");} else {System.out.println("O Controle está: DESLIGADO");}
		for (int i=1; i <= this.getVolume(); i += 10) {System.out.print(" |");}
		System.out.println(" Volume: " + this.getVolume());
		if (this.getTocando()) { System.out.println("Ele está tocando");}else {System.out.println("Ele não esta tocando");}
		}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando o menu...");
	}

	@Override
	public void maisVolume() {
		if (this.getLigado()){setVolume(getVolume() + 1);}
	}

	@Override
	public void menosVolume() {
		if (this.getLigado()){setVolume(getVolume() - 1);}
	}

	@Override
	public void ligarMudo() {
		if (this.getLigado() || this.getVolume() > 0) {this.setVolume(0); System.out.println("O muto esta ativado");}
	}

	@Override
	public void desligarMudo() {
		if (this.getLigado() || this.getVolume() == 0) {this.setVolume(1); System.out.println("O mudo foi desativado");}
	}

	@Override
	public void play() {
		if (this.getLigado() || this.getTocando() == false) {this.setTocando(true); System.out.println("O play foi ativado");}
	}

	@Override
	public void pause() {
		if (this.getLigado() || this.getTocando() == true) {this.setTocando(false); System.out.println("O pause foi ativado");}

	}

}

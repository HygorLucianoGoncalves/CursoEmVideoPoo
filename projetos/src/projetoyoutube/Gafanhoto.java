package projetoyoutube;

public class Gafanhoto extends Pessoa {
	private String login;
	private int totAssistido;
	
	public Gafanhoto(String nome, int idade, String sexo,String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totAssistido = 0;
	}

	
	public String getLogin() {
		return login;
	}
	
	public int getTotAssistido() {
		return totAssistido;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}
	
	@Override
	public String toString() {
		return "Gafanhoto{" +  super.toString() + "\nLogin=" + login + ", totAssitido=" + totAssistido + "}";
	}
}

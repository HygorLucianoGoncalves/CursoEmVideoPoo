package aula02;

public class Teste {
	public static void main(String[] args) {
		Canetaa caneta = new Canetaa();
		caneta.cor = "Azul";
		caneta.ponta= 0.5;
		caneta.tampada = false;
		
		caneta.destampar();
		caneta.rabiscar();
		caneta.status();
		
		Canetaa caneta2 = new Canetaa();
		caneta2.modelo = "Bic";
		caneta2.cor = "preta";
		caneta2.rabiscar();
		
		caneta2.destampar();
		caneta.rabiscar();
		caneta.status();
		
	}
}

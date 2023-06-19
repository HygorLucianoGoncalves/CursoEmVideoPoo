package aula05;

public class Aula05 {

	public static void main(String[] args) {
		
		
		ContaBanco conta1 = new ContaBanco();
		conta1.setNumConta(2222);
		conta1.setDono("Jubileu");
		conta1.abrirConta("cc");

		
		ContaBanco conta2 = new ContaBanco();
		conta2.setNumConta(3333);
		conta2.setDono("creuza");
		conta2.abrirConta("CP");
		
		conta1.deposita(50);
		conta2.deposita(500);
		conta2.sacar(100);
		
		conta1.sacar(100);
		conta1.fecharConta();
		
		conta1.InfoDaConta();
		conta2.InfoDaConta();

	}

}

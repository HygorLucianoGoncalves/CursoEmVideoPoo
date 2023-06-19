package aula05;

public class ContaBanco {
	// Atribudos
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;

	// contrudor
	public ContaBanco() {
		this.saldo = 0;
		this.status = false;
	}

	public void InfoDaConta() {
		System.out.println("------------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
	
	// set and get = numConta
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public int getNumConta() {
		return this.numConta;
	}
	
	
	// set and get = tipo

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return this.tipo;
	}

	
	
	// set and get = dono

	public void setDono(String dono) {
		this.dono = dono;
	}

	public String getDono() {
		return this.dono;
	}

	
	
	// set and get = saldo;

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return this.saldo;
	}

	
	
	// set and get = status;

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean getStatus() {
		return this.status;
	}

	
	
	// Métodos
	
	
	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		if (tipo == "CC" || tipo == "cc") {
			this.setSaldo(50);
		} else if (tipo == "CP" || tipo == "cp") {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso");
	}

	
	
	public void fecharConta() {

		if (this.getSaldo() > 0) {
			System.out.println("Conta tem dinheiro não pode ser fechada");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta com débito não pode ser fechada");
		} else {
			this.setStatus(false);
			System.out.println("Conta de " + this.getDono() + " FECHADA");
		}
		
	}

	
	
	public void deposita(double valor) {

		if (this.getStatus() == true) {
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Deposito realizado na conta de " + this.getDono());
		} else {
			System.out.println("Impossivel Depositar");
		}
	}

	
	
	public void sacar(double valor) {
		if (this.getStatus() == true) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saldo realizado na conta de " + this.getDono());
			} else {
				System.out.println("Saldo Insuficiente ");
			}
		} else {
			System.out.println("Impossivel sacar, Conta está fechada ");
		}
	}

	
	public void pagarMensal() {
		int valorDaMensalidade = 0;
		if (this.getTipo() == "CC") {
			valorDaMensalidade = 12;
		} else if (this.getTipo() == "CP") {
			valorDaMensalidade = 20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - valorDaMensalidade);
			System.out.println("Mensalidade paga com sucesso por " + this.getDono());
		}else {
			System.out.println("Impossível pagar uma conta fechada!");
		}
	}

}

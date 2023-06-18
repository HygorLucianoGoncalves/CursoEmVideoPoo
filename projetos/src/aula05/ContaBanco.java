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

	// set and get = numConta
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public int getNumConta() {
		return numConta;
	}
	// set and get = tipo

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	// set and get = dono

	public void setDono(String dono) {
		this.dono = dono;
	}

	public String getDono() {
		return dono;
	}

	// set and get = saldo;

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
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
		setTipo(tipo);
		setStatus(true);
		if (tipo == "CC") {
			setSaldo(50);
		} else if (tipo == "CP") {
			setSaldo(150);
		}

	}

	public void fecharConta() {

		if (saldo > 0) {
			System.out.println("Conta tem dinheiro");
		} else if (saldo < 0) {
			System.out.println("Conta com débito");
		} else {
			setStatus(false);
		}
	}

	public void deposita(double valor) {

		if (getStatus() == true) {
			setSaldo(getSaldo() + valor);
		} else {
			System.out.println("Impossivel Depositar");
		}
	}

	public void sacar(double valor) {
		if (getStatus() == true) {
			if (getSaldo() >= valor) {
				setSaldo(getSaldo() - valor);
			} else {
				System.out.println("Saldo Insuficiente ");
			}

		} else {
			System.out.println("Impossivel sacar, Conta está fechada ");
		}
	}

	public void pagarMensal() {
		double valorDaMensalidade = 0;
		if (getTipo() == "CC") {			
			valorDaMensalidade = 12;
		} else if(getTipo() == "CP") { 
			valorDaMensalidade = 20;
		} else {
			if (getStatus() == true) {
				if (getSaldo() > valorDaMensalidade) {
					setSaldo(getSaldo() - valorDaMensalidade); 
				} else {
					System.out.println("Saldo Insuficiente");
				}
			} else {
				System.out.println("Impossivel Pagar");
			}
		}
				
	}

}

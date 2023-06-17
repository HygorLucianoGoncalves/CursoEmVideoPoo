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

	private void getStatus() {
		return this.status;

	}

	// Métodos
	public void abrirConta() {

	}

	public void fecharConta() {

	}

	public void deposita() {

	}

	public void sacar() {

	}

	public void pagarMensal() {

	}

}

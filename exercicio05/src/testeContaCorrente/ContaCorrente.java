package testeContaCorrente;

public class ContaCorrente {

	private String agencia;
	private String numeroConta;
	private String tipo;
	private float saldo;
	private float limite;
	
	public ContaCorrente(String agencia, String numeroConta, String tipo, float limite) {
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.tipo = tipo;
		this.limite = limite;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getSaldo() {
		return saldo;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public void depositar(float valorFornecido) {
		saldo += valorFornecido;
	}
	
	public boolean sacar(float valorFornecido) {
		if(valorFornecido <= saldo) {
			saldo -= valorFornecido;
			return true;
		} else if(tipo.equalsIgnoreCase("E") && valorFornecido <= (saldo + limite)) {
				saldo = 0;
				limite -= (valorFornecido - saldo);
			return true;
		} else {
			return false;
		}
	}
	

}

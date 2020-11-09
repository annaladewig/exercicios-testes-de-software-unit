package testePagamento;

public class Pagamento {
	
	private float valorVenda;
	private boolean pago;
	

	public Pagamento(float valorVenda, boolean pago) {
		this.valorVenda = valorVenda;
		this.pago = pago;
	}

	public float getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}


	public boolean isPago() {
		return pago;
	}


	public float calcularTroco(float valorFornecido) {
		return	valorFornecido - valorVenda;		
	}
	
	public void registrarPagamento() {
		pago = true;
	}
}

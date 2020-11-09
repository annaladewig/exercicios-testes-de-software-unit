package testePagamento;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PagamentoTest {

	@Test
	void testCalcularTroco() {
		Pagamento pagamento = new Pagamento(10.00f, false);
		assertTrue(40.00 == pagamento.calcularTroco(50.00f));
	}
	
	@Test
	void testRegistrarPagamento() {
		Pagamento pagamento = new Pagamento(10.00f, false);
		pagamento.registrarPagamento();
		assertTrue(true == pagamento.isPago());
	}

}

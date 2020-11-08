package testeRecebimentoNoMes;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class RecebimentoTest {

	@Test
	void testRecebimentoNoMes() {
		Recebimento recebimento = new Recebimento();
		assertTrue(100.00 == recebimento.recebimentoNoMes(100.00, "04/09/2020", "01/09/2020")); //antes do vencimento
		assertTrue(100.00 == recebimento.recebimentoNoMes(100.00, "10/09/2020", "10/09/2020")); //no dia do vencimento
		assertTrue(104.50 == recebimento.recebimentoNoMes(100.00, "10/09/2020", "13/09/2020")); //dia após vencimento
		assertTrue(148.00 == recebimento.recebimentoNoMes(100.00, "23/04/2020", "25/05/2020")); //mês após vencimento
		assertTrue(289.00 == recebimento.recebimentoNoMes(100.00, "27/08/2020", "03/01/2021")); //ano após vencimento
		
	}

}

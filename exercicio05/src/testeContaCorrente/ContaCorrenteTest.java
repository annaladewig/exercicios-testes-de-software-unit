package testeContaCorrente;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContaCorrenteTest {

	@Test
	void testDepositar() {
		ContaCorrente contaCorrenteNormal = new ContaCorrente("001", "54321", "N", 0f);
		contaCorrenteNormal.depositar(100f);
		assertTrue(100f == contaCorrenteNormal.getSaldo());
		
		ContaCorrente contaCorrenteEspecial = new ContaCorrente("001", "54321", "E", 1000f);
		contaCorrenteEspecial.depositar(100f);
		assertTrue(100f == contaCorrenteEspecial.getSaldo());
	}

	@Test
	void testSacarContaNormalAbaixoLimite() {
		ContaCorrente contaCorrente = new ContaCorrente("001", "54321", "N", 0f);
		contaCorrente.depositar(100f);
		assertTrue(contaCorrente.sacar(50f) == true);
	}
	
	@Test
	void testSacarContaNormalNoLimite() {
		ContaCorrente contaCorrente = new ContaCorrente("001", "54321", "N", 0f);
		contaCorrente.depositar(100f);
		assertTrue(contaCorrente.sacar(100f) == true);
	}

	@Test
	void testSacarContaNormalAcimaLimite() {
		ContaCorrente contaCorrente = new ContaCorrente("001", "54321", "N", 0f);
		contaCorrente.depositar(100f);
		assertTrue(contaCorrente.sacar(120f) == false);
	}
	
	@Test
	void testSacarContaEspecialAbaixoLimite() {
		ContaCorrente contaCorrente = new ContaCorrente("001", "54321", "E", 1000f);
		assertTrue(contaCorrente.sacar(900f) == true);
	}

	@Test
	void testSacarContaEspecialNoLimite() {
		ContaCorrente contaCorrente = new ContaCorrente("001", "54321", "E", 1000f);
		assertTrue(contaCorrente.sacar(1000f) == true);
	}

	@Test
	void testSacarContaEspecialAcimaLimite() {
		ContaCorrente contaCorrente = new ContaCorrente("001", "54321", "E", 1000f);
		assertTrue(contaCorrente.sacar(1100f) == false);
	}

}

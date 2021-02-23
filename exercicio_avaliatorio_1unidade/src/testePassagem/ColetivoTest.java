package testePassagem;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class ColetivoTest {

	@Test
	public void testConsumirPassagemAnelA() {
		
		CartaoVem cartao1 = new CartaoVem(1);
		cartao1.carregar(1, 'A');
		
		Coletivo coletivoA = new Coletivo(1, "A-40", "Centro-Sul", 'A');
		assertTrue(3.5f == coletivoA.consumirPassagem(cartao1));	// Saldo do cartão maior que o valor da passagem.
		assertTrue(7.0f == coletivoA.consumirPassagem(cartao1));	// Saldo do cartão com exatamente o valor da passagem.
		assertTrue(7.0f == coletivoA.consumirPassagem(cartao1));	// Sem saldo no cartão.
	}

	@Test
	public void testConsumirPassagemAnelB() {
		CartaoVem cartao2 = new CartaoVem(2);
		cartao2.carregar(1, 'B');
		
		Coletivo coletivoB = new Coletivo(2, "B-33", "Centro", 'B');
		assertTrue(4.5f == coletivoB.consumirPassagem(cartao2));	// Saldo do cartão maior que o valor da passagem.
		assertTrue(9.0f == coletivoB.consumirPassagem(cartao2));	// Saldo do cartão com exatamente o valor da passagem.
		assertTrue(9.0f == coletivoB.consumirPassagem(cartao2));	// Sem saldo no cartão.
		
	}

	@Test
	public void testConsumirPassagemAnelG() {
		CartaoVem cartao3 = new CartaoVem(3);
		cartao3.carregar(1, 'G');
		
		Coletivo coletivoG = new Coletivo(3, "G-15", "Centro-Leste", 'G');
		assertTrue(2.5f == coletivoG.consumirPassagem(cartao3));	// Saldo do cartão maior que o valor da passagem.
		assertTrue(5.0f == coletivoG.consumirPassagem(cartao3));	// Saldo do cartão com exatamente o valor da passagem.
		assertTrue(5.0f == coletivoG.consumirPassagem(cartao3));	// Sem saldo no cartão.
	}

}

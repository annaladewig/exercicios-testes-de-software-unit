package testePassagem;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CartaoVemTest {

	@Test
	public void testCarregar() {
		CartaoVem cartao = new CartaoVem(001);
		assertTrue(70.00f == cartao.carregar(10, 'A'));		// Anel A
		assertTrue(160.00f == cartao.carregar(10, 'B'));	// Anel B
		assertTrue(210.00f == cartao.carregar(10, 'G'));	// Anel C
	}
	
	@Test
	public void testUsar() {
		CartaoVem cartao = new CartaoVem(002);
		cartao.carregar(1, 'A');
		assertTrue(3.5f == cartao.usar('A'));	// Saldo maior que o valor da passagem
		assertTrue(3.5f == cartao.usar('A'));	// Saldo com exatamente o valor da passagem
		assertTrue(0f == cartao.usar('A'));		// Sem Saldo
		
		cartao.carregar(1, 'B');
		assertTrue(4.5f == cartao.usar('B'));	// Saldo maior que o valor da passagem
		assertTrue(4.5f == cartao.usar('B'));	// Saldo com exatamente o valor da passagem
		assertTrue(0f == cartao.usar('B'));		// Sem Saldo
		
		cartao.carregar(1, 'G');
		assertTrue(2.5f == cartao.usar('G'));	// Saldo maior que o valor da passagem	
		assertTrue(2.5f == cartao.usar('G'));	// Saldo com exatamente o valor da passagem
		assertTrue(0f == cartao.usar('G'));		// Sem Saldo
	}
	
}

package locacao;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BicicletaTest {
	
	Bicicleta bicicleta;
	
	@Before
	public void criarBicicletaLocacao() {
		bicicleta = new Bicicleta(014, "Caloi Preta Masculina", 'P', 5.00f);
	}

	@Test
	public void testMarcarDisponibilidade() {
		bicicleta.marcarDisponibilidade();
		assertTrue(true == bicicleta.isDisponivel());
	}

	@Test
	public void testMarcarIndisponibilidade() {
		bicicleta.marcarIndisponibilidade();
		assertTrue(false == bicicleta.isDisponivel());
	}
}

package testeVerificacaoDeQualidadeDaProducao;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProducaoTest {

	@Test
	public void testVerificaQualidade() {
		Producao producao = new Producao();
		assertEquals("comercio", producao.verificaQualidade(1f, 10f));
		assertEquals("descarte", producao.verificaQualidade(5f, 50f));
	}

}

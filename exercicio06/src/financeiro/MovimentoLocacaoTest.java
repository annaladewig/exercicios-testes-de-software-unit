package financeiro;

import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Before;
import org.junit.Test;

import locacao.Bicicleta;
import locacao.Locacao;

public class MovimentoLocacaoTest {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Locacao locacao;
	
	@Before
	public void criarBicicletaLocacao() throws ParseException {
		Bicicleta bicicleta = new Bicicleta(045, "Caloi Feminina", 'P', 5.00f);
		locacao = new Locacao(023, sdf.parse("09/10/2020"), bicicleta, 10);
	}

	@Test
	public void testCalcularInss() throws ParseException {
		MovimentoLocacao movimentoLocacao = new MovimentoLocacao(001, sdf.parse("09/10/2020"), locacao, 15.00f);
		movimentoLocacao.calcularInss();
		assertTrue(0.75f == movimentoLocacao.getValorInss());
	}
}

package locacao;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Before;
import org.junit.Test;

public class LocacaoTest {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Bicicleta bicicleta;
	
	@Before
	public void criarBicicleta() throws ParseException {
		bicicleta = new Bicicleta(045, "Caloi Feminina", 'P', 5.00f);
	}
	
	@Test
	public void testRegistrarLocacao() throws ParseException {
		Locacao locacao = new Locacao();
		assertTrue(025 == locacao.registrarLocacao(025, sdf.parse("09/10/2020"), bicicleta, 9));
	}
	
	@Test
	public void testRegistrarDevolucao() throws ParseException {
		Locacao locacao = new Locacao(023, sdf.parse("09/10/2020"), bicicleta, 10);
		assertTrue(25.00f == locacao.registrarDevolucao(023, 15));
	}
}

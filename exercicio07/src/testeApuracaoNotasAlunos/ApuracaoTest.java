package testeApuracaoNotasAlunos;

import static org.junit.Assert.*;

import org.junit.Test;

public class ApuracaoTest {

	@Test
	public void testApuracaoMedia() {
		Apuracao apuracao1 = new Apuracao(1, 10f, 10f, 0f, 0f, 74);
		assertEquals("Reprovado por falta", apuracao1.apuracaoMedia());
		
		Apuracao apuracao2 = new Apuracao(1, 9f, 10f, 0f, 0f, 75);
		assertEquals("Aprovado", apuracao2.apuracaoMedia());
		
		Apuracao apuracao3 = new Apuracao(1, 0f, 2f, 3f, 0f, 75);
		assertEquals("Reprovado", apuracao3.apuracaoMedia());
		
		Apuracao apuracao4 = new Apuracao(1, 6f, 0f, 6f, 8f, 75);
		assertEquals("Aprovado na final", apuracao4.apuracaoMedia());
		
		Apuracao apuracao5 = new Apuracao(1, 5f, 0f, 5f, 4f, 75);
		assertEquals("Reprovado na final", apuracao5.apuracaoMedia());
	}

}

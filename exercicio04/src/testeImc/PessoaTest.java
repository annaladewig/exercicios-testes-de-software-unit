package testeImc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PessoaTest {

	@Test
	void testCalcularImc() {
		Pessoa pessoa = new Pessoa(80.0f, 1.80f);
		
		float valor = (float) (Math.round(pessoa.calcularImc() * 100.0f) / 100.f); //para deixar com 2 casas decimais
		assertEquals(24.69f, valor);
		
	}

	@Test
	void testCalcularPesoIdeal() {
		Pessoa pessoa = new Pessoa(80.0f, 1.80f);
		
		float valorMin = (float) (Math.round(pessoa.calcularPesoIdeal("Min") * 100.0f) / 100.f); //teste min
		assertEquals(59.94f, valorMin);
		
		float valorMed = (float) (Math.round(pessoa.calcularPesoIdeal("Med") * 100.0f) / 100.f); //teste med
		assertEquals(70.47f, valorMed);
		
		float valorMax = (float) (Math.round(pessoa.calcularPesoIdeal("Max") * 100.0f) / 100.f); //teste max
		assertEquals(81f, valorMax);
		
		float valorParametroDiferente = (float) (Math.round(pessoa.calcularPesoIdeal("xxx") * 100.0f) / 100.f); //teste string diferente
		assertEquals(0f, valorParametroDiferente);
	}

}

package testeMediaDoAluno;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class MediaDoAlunoTest {

	@Test
	void testCalcularMediaSemSegundaChamada() {
		MediaDoAluno media = new MediaDoAluno();
		assertTrue( 9.0 == media.calcularMedia(10f, 8.0f, null) ); 
		assertTrue( 4.0 == media.calcularMedia(3.0f, 5.0f, null) );
		assertTrue( 5.0 == media.calcularMedia(10.0f, 0.0f, null) );
		assertTrue( 7.0 == media.calcularMedia(6.0f, 8.0f, null) );
	}

	@Test
	void testCalcularMediaComSegundaChamada() {
		MediaDoAluno media = new MediaDoAluno();
		assertTrue( 6.5 == media.calcularMedia(null, 5.0f, 8.0f) );  //faltou 1º prova
		assertTrue( 7.5 == media.calcularMedia(10.0f, null, 5.0f) ); //faltou 2º prova
		assertTrue( 4.0 == media.calcularMedia(null, null, 8.0f) );  //fez apenas 2º chamada
	}


	@Test
	void testSituacaoDoAluno() {
		MediaDoAluno situacao = new MediaDoAluno();
		assertEquals( "Aprovado", situacao.situacaoDoAluno(8));  //acima da média
		assertEquals( "Aprovado", situacao.situacaoDoAluno(7));  //na média
		assertEquals( "Reprovado", situacao.situacaoDoAluno(4)); //abaixo da média 
	}

}

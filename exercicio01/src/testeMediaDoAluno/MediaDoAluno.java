package testeMediaDoAluno;

public class MediaDoAluno {
	
	public Float calcularMedia(Float nota1, Float nota2, Float segundaChamada) {
		Float media = 0.0f;
		
		if (nota1 != null && nota2 != null) {
			media = (nota1 + nota2) / 2;
		}
		if (nota1 != null && nota2 == null && segundaChamada != null) {
			media = (nota1 + segundaChamada) / 2;			
		}
		if (nota1 == null && nota2 != null && segundaChamada != null) {
			media = (nota2 + segundaChamada) / 2;			
		}
		if (nota1 == null && nota2 == null && segundaChamada != null) {
			media = segundaChamada / 2;			
		}
		return media;
	}
	
	public String situacaoDoAluno(float media) {
		if (media>=7) {
			return "Aprovado";
		} else {
			return "Reprovado";
		}
	}
}

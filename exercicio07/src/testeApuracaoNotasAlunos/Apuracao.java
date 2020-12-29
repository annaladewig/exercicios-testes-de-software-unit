package testeApuracaoNotasAlunos;

public class Apuracao {

		private int id;
		private float nota1;
		private float nota2;
		private float notaSegChamada;
		private float notaFinal;
		private float percFrequencia;
		private float mediaSemestre;
		private float mediaFinal;
		private String situacao;
		
		public Apuracao(int id, float n1, float n2, float nsch, float nf, float pf) {
			this.id = id;
			this.nota1 = n1;
			this.nota2 = n2;
			this.notaSegChamada = nsch;
			this.notaFinal = nf;
			this.percFrequencia = pf;
			this.mediaSemestre = 0;
			this.mediaFinal = 0;
		}
		
		public String apuracaoMedia() {
			float media = 0;
			
			if (this.percFrequencia < 75) {
				this.situacao = "Reprovado por falta";
			} else {
				if (this.nota1 != 0 && this.nota2 != 0) {
					// O estudante passou por duas avaliações.
					media = (this.nota1 + this.nota2) / 2;
				} else if (this.nota1 == 0) {
					// Estudante fez 2ª chamada para substituir a 1ª nota.
					media = (this.nota2 + this.notaSegChamada) / 2;		
				} else {
					// Estudante fez 2ª chamada para substituir a 2ª nota.
					media = (this.nota1 + this.notaSegChamada) / 2;
				}
				
				this.mediaSemestre = media;
				
				if (this.mediaSemestre >=7) {
					this.situacao = "Aprovado";
				} else if (this.mediaSemestre < 3){
					// Media menor que 3 não tem direito a final.
					this.situacao = "Reprovado";				
				} else {
					this.mediaFinal = (this.mediaSemestre + this.notaFinal) / 2;
					if (this.mediaFinal >= 5 ) {
						// Na final a média passa a ser 5.
						this.situacao = "Aprovado na final";
					} else {
						this.situacao = "Reprovado na final";					
					}
				}
			}		
			return situacao;
		}
}

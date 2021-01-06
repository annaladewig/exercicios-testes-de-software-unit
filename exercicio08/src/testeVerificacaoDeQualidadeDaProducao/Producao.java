package testeVerificacaoDeQualidadeDaProducao;

public class Producao {

	private int id;
	private String status;

	public String verificaQualidade(float espessura, float temperatura) {
		int dias = 0;
		float fator = 0.993f;
		
		if (temperatura > 30 && espessura < 5 || 
			temperatura > 35 && espessura >=5) {
			fator = 0.992f;		
		}

		float desgaste = espessura;
		while (desgaste > espessura * 0.8 ) {
			dias++;
			desgaste = desgaste * fator;
		}
		if (dias < 30) {
			this.status = "descarte";
		} else {
			this.status = "comercio";
		}

		return this.status;
	}
}


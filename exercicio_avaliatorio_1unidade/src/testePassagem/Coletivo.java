package testePassagem;

public class Coletivo {
	
	private int id;
	private String codLinha;
	private String nomeLinha;
	private char anel;
	private float apurado;
	
	public Coletivo(int id, String codLinha, String nomeLinha, char anel) {
		this.id = id;
		this.codLinha = codLinha;
		this.nomeLinha = nomeLinha;
		this.anel = anel;
		this.apurado = 0;
	}

	public String getCodLinha() {
		return codLinha;
	}

	public void setCodLinha(String codLinha) {
		this.codLinha = codLinha;
	}

	public String getNomeLinha() {
		return nomeLinha;
	}

	public void setNomeLinha(String nomeLinha) {
		this.nomeLinha = nomeLinha;
	}

	public char getAnel() {
		return anel;
	}

	public void setAnel(char anel) {
		this.anel = anel;
	}

	public int getId() {
		return id;
	}

	public float getApurado() {
		return apurado;
	}
	
	public float consumirPassagem(CartaoVem cartao) {
		apurado += cartao.usar(anel);
		return apurado;
	}
}

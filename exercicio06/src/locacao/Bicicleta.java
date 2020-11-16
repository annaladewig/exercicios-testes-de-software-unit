package locacao;

public class Bicicleta {

	private int id;
	private String descricao;
	private char tipo;
	private float valorLocacaoHora;
	private boolean disponivel;
	
	public Bicicleta(int id, String descricao, char tipo, float valorLocacaoHora) {
		this.id = id;
		this.descricao = descricao;
		this.tipo = tipo;
		this.valorLocacaoHora = valorLocacaoHora;
		marcarDisponibilidade();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public float getValorLocacaoHora() {
		return valorLocacaoHora;
	}

	public void setValorLocacaoHora(float valorLocacaoHora) {
		this.valorLocacaoHora = valorLocacaoHora;
	}

	public boolean isDisponivel() {
		return disponivel;
	}
	
	public boolean marcarDisponibilidade() {
		disponivel = true;
		return true;
	}
	
	public boolean marcarIndisponibilidade() {
		disponivel = false;
		return false;
	}
	
}

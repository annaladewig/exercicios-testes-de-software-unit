package financeiro;

import java.util.Date;

import locacao.Locacao;

public class MovimentoLocacao {

	private int id;
	private Date data;
	private Locacao locacao;
	private float valor;
	private float valorInss;
	
	public MovimentoLocacao(int id, Date data, Locacao locacao, float valor) {
		this.id = id;
		this.data = data;
		this.locacao = locacao;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Locacao getLocacao() {
		return locacao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public float getValorInss() {
		return valorInss;
	}

	public void setValorInss(float valorInss) {
		this.valorInss = valorInss;
	}
	
	public float calcularInss() {
		valorInss = (float) (valor * 0.05);
		return valorInss;
	}
}

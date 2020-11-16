package locacao;

import java.util.Date;

public class Locacao {

	private int idLocacao;
	private Date data;
	private Bicicleta bicicleta;
	private int horaInicio;
	private int horaFinal;
	private float valorLocacao;
	
	public Locacao() {
	}
	
	public Locacao(int idLocacao, Date data, Bicicleta bicicleta, int horaInicio) {
		registrarLocacao(idLocacao, data, bicicleta, horaInicio);
	}

	public int getIdLocacao() {
		return idLocacao;
	}

	public void setIdLocacao(int idLocacao) {
		this.idLocacao = idLocacao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Bicicleta getBicicleta() {
		return bicicleta;
	}

	public int getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}

	public int getHoraFinal() {
		return horaFinal;
	}

	public void setHoraFinal(int horaFinal) {
		this.horaFinal = horaFinal;
	}

	public float getValorLocacao() {
		return valorLocacao;
	}

	public void setValorLocacao(float valorLocacao) {
		this.valorLocacao = valorLocacao;
	}
	
	public int registrarLocacao(int idLocacao, Date data, Bicicleta bicicleta, int horaInicio) {
		this.idLocacao = idLocacao;
		this.data = data;
		this.bicicleta = bicicleta;
		this.horaInicio = horaInicio;
		return idLocacao;
	}
	
	public float registrarDevolucao(int idLocacao, int horaFinal) {
		this.idLocacao = idLocacao;
		this.horaFinal = horaFinal;
		valorLocacao = (horaFinal - horaInicio) * bicicleta.getValorLocacaoHora();
		return valorLocacao;
	}
	
}

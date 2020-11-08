package testeRecebimentoNoMes;

public class Recebimento {

	public Double recebimentoNoMes(Double valorParcela, String diaDeVencimento, String diaDePagamento) {
		Integer diaVencimento = Integer.parseInt(diaDeVencimento.substring(0, 2));
		Integer mesVencimento = Integer.parseInt(diaDeVencimento.substring(3, 5));
		Integer anoVencimento = Integer.parseInt(diaDeVencimento.substring(6));
		Integer diaPagamento = Integer.parseInt(diaDePagamento.substring(0, 2));
		Integer mesPagamento = Integer.parseInt(diaDePagamento.substring(3, 5));
		Integer anoPagamento = Integer.parseInt(diaDePagamento.substring(6));
		
		Integer diferenca, diferencaAno;
		final Float multaAtraso = 1.5f;
		
		if(anoVencimento >= anoPagamento) {
			if(mesVencimento >= mesPagamento) {
				if(diaPagamento <= diaVencimento) {
					return valorParcela;
				} else {
					diferenca = diaPagamento - diaVencimento;
					return valorParcela + (diferenca * multaAtraso);
				}
			} else {
				diferenca = (diaPagamento - diaVencimento) + (mesPagamento - mesVencimento) * 30;
				return valorParcela + (diferenca * multaAtraso);
			}
		} else {
			diferencaAno = anoPagamento - anoVencimento;
			diferenca = (diaPagamento - diaVencimento) + ((12 * diferencaAno) - mesVencimento) * 30 + (mesPagamento * 30);
			return valorParcela + (diferenca * multaAtraso);
		}
	}

}

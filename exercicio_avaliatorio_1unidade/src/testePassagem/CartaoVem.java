package testePassagem;

public class CartaoVem {
	
	private int id;
	private float saldo;
	
	public CartaoVem(int id) {
		this.id = id;
		this.saldo = 0;
	}

	public int getId() {
		return id;
	}

	public float getSaldo() {
		return saldo;
	}
	
	public float carregar(int dias, char anel) {
		float carga = 0;
		
		if (anel == 'A') {
			carga = 3.5f;
		} else if (anel == 'B') {
			carga = 4.5f;		
		} else if (anel == 'G') {
			carga = 2.5f;
		}
		saldo += carga * dias * 2;
		return saldo;
	}
	
	public float usar(char anel) {
		float consumo = 0;
		
		if (anel == 'A') {
			consumo = 3.5f;
		} else if (anel == 'B') {
			consumo = 4.5f;		
		} else if (anel == 'G') {
			consumo = 2.5f;
		}
		if (saldo >= consumo) {
			saldo -= consumo;	
		}
		else {
			consumo = 0;
		}
		return consumo;
	}
}

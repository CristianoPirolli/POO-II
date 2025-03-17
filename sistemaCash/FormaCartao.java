package sistemaCash;

public class FormaCartao extends FormaPag{

	@Override
	public Pagamento realizarPag() {		
		return new Cartao();
	}

}


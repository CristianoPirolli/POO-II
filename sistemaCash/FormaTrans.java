package sistemaCash;

public class FormaTrans extends FormaPag{

	@Override
	public Pagamento realizarPag() {		
		return new Transferencia();
	}

}

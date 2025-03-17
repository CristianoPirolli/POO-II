package sistemaCash;

public class FormaPix extends FormaPag{

	@Override
	public Pagamento realizarPag() {		
		return new Pix();
	}

}

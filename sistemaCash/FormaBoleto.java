package sistemaCash;

public class FormaBoleto extends FormaPag {
    
    @Override
	public Pagamento realizarPag() {		
		return new Boleto();
	}
}

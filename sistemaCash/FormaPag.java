package sistemaCash;

public abstract class FormaPag {
	
		
	public void formaPag() {
		System.out.println("Efetuando pagamento...");
		Pagamento pagamento = realizarPag();
		pagamento.pagamento();
	}
	
	public abstract Pagamento realizarPag();
}

package sistemaCash;

public class Main {
	
	public static void main(String[] args) {
		Pagamento p = new Boleto();
		p.pagamento();
        Pagamento p1 = new Cartao();
        p1.pagamento();
        Pagamento p2 = new Pix();
        p2.pagamento();
	}	
}
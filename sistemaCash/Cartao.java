package sistemaCash;

public class Cartao implements Pagamento {

	@Override
	public void pagamento() {
		System.out.println("Pagamento efetuado via Cartao");

	}

}


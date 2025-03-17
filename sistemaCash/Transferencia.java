package sistemaCash;

public class Transferencia implements Pagamento {

    @Override
    public void pagamento() {
        System.out.println("Pagamento efetuado via Transferencia");

    }
}

package sistemaCash;

public class Boleto implements Pagamento {
    
    @Override
    public void pagamento() {
        System.out.println("Pagamento efetuado via Boleto");

    }
}

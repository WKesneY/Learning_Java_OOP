import java.util.*;
public class AppPagamento {
    public static void main(String[] args){
        Scanner scanner = Scanner(System.in);
        FormaPagamento credito = new CartaoCredito(0, 0, null);
        FormaPagamento boleto = new BoletoBancario(0, 0, null);
        FormaPagamento transferencia = new Transferencia(0, 0, null);

        System.out.println("------PAGAMENTO VIA CARTAO DE CREDITO------");
        System.out.println("\tInforme o valo total: ");
        credito.setValorTotal(scanner);
        
        System.out.println("------PAGAMENTO VIA BOLETO BANCÁRIO------");

        System.out.println("------PAGAMENTO VIA TRANSFERENCIA BANCÁRIA------");

    }
}

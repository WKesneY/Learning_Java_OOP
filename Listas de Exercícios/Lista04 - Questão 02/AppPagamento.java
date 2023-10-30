import java.util.*;
public class AppPagamento {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        FormaPagamento credito = new CartaoCredito(0, 0, null);
        FormaPagamento boleto = new BoletoBancario(0, 0, null);
        FormaPagamento transferencia = new Transferencia(0, 0, null);

        System.out.println("------PAGAMENTO VIA CARTAO DE CREDITO------");
        System.out.printf("\n\tInforme o numero do cartão de crédito: ");
        ((CartaoCredito) credito).setNumeroCartao(scanner.nextLine());
        System.out.printf("\n\tInforme o valor total: ");
        credito.setValorTotal(scanner.nextDouble());
        credito.realizarPagamento();

        scanner.nextLine();
        System.out.println("------PAGAMENTO VIA BOLETO BANCÁRIO------");
        System.out.printf("\n\tInforme o código de barras: ");
        ((BoletoBancario) boleto).setCodigoBoleto(scanner.nextLine());
        System.out.printf("\n\tInforme o valor total: ");
        boleto.setValorTotal(scanner.nextDouble());
        boleto.realizarPagamento();

        scanner.nextLine();
        System.out.println("------PAGAMENTO VIA TRANSFERENCIA BANCÁRIA------");
        System.out.printf("\n\tInforme o código de barras: ");
        ((Transferencia) transferencia).setBancoDestino(scanner.nextLine());
        System.out.printf("\tInforme o valor total: ");
        transferencia.setValorTotal(scanner.nextDouble());
        transferencia.realizarPagamento();

        scanner.close();

    }
}

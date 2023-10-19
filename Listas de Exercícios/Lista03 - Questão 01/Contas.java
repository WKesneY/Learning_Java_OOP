import java.util.*;
public class Contas {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ContaPoupanca clientePoupanca = new ContaPoupanca("Everton", 515451, 1500.00);
    ContaEspecial clieContaEspecial = new ContaEspecial("Kesney", 55485, 5000.00);

    System.out.println("\t-----------CONTA ESPECIAL-----------");
    clieContaEspecial.imprimirDados();
    System.out.printf("Informe um valor a ser sacado: ");
    double saque = scanner.nextDouble();
    clieContaEspecial.sacar(saque);
    clieContaEspecial.imprimirDados();
    System.out.println("Informe um valor para depósito: ");
    double depositar = scanner.nextDouble();
    clieContaEspecial.depositar(depositar);
    clieContaEspecial.imprimirDados();
    

    System.out.println("\t-----------CONTA POUPANÇA-----------");
    clientePoupanca.imprimirDados();
    clientePoupanca.calculaNovoSaldo(); //calculando saldo com rendimento
    clientePoupanca.imprimirDados();    //valor com rendimento
    System.out.println("Informe um valor para depósito: ");
    depositar = scanner.nextDouble();
    clientePoupanca.depositar(depositar);
    clientePoupanca.imprimirDados();

    }

}

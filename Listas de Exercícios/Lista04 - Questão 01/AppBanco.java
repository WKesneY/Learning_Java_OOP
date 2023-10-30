import java.util.*;
public class AppBanco {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        ContaBancaria contaPoupanca = new ContaPoupanca(null, 0, 0);
        ContaBancaria contaCorrente = new ContaCorrente(null, 0, 0);

        // CONTA POUPANÇA
        System.out.println("BANCO UFC - CRIAR CONTAS");
        System.out.println("--------------CRIANDO UMA CONTA POUPANÇA.--------------");
        System.out.printf("\t\tInforme o número da conta: ");
        contaPoupanca.numeroConta = scanner.nextLine();
        System.out.printf("\t\tInforme o saldo inicial: ");
        contaPoupanca.saldo = scanner.nextDouble();
        System.out.print("\t\tInforme o rendimento em %: ");
        ((ContaPoupanca) contaPoupanca).setTaxaRendimento(scanner.nextDouble());

        contaPoupanca.imprimir();

        System.out.println("\n--------------CONTA POUPANCA SAQUE --------------");
        System.out.printf("\nSeu saldo atual: " + contaPoupanca.getSaldo());
        System.out.printf("\n\tInforme quanto deseja sacar: ");
        contaPoupanca.sacar(scanner.nextDouble());

        contaPoupanca.imprimir();

        System.out.printf("\n--------------CONTA POUPANCA DEPOSITO --------------");
        System.out.printf("\nSeu saldo atual: " + contaPoupanca.getSaldo());
        System.out.printf("\n\tInforme quanto deseja depositar: ");
        contaPoupanca.depositar(scanner.nextDouble());

        contaPoupanca.imprimir();

        System.out.printf("\n--------------CONTA POUPANCA RENDIMENTO --------------");
        System.out.printf("\nSeu saldo atual: %.2f", contaPoupanca.getSaldo());
        System.out.printf("\nSeu saldo após a taxa de rendimento ser aplicada: %.2f",((ContaPoupanca)contaPoupanca).getSaldoComRendimento());

        // CONTA CORRENTE

        scanner.nextLine();
        System.out.println("BANCO UFC - CRIAR CONTAS");
        System.out.println("--------------CRIANDO UMA CONTA CORRENTE.--------------");
        System.out.printf("\t\tInforme o número da conta: ");
        contaCorrente.numeroConta = scanner.nextLine();
        System.out.printf("\t\tInforme o saldo inicial: ");
        contaCorrente.saldo = scanner.nextDouble();
        System.out.print("\t\tInforme o limite de seu Cheque Especial: ");
        ((ContaCorrente) contaCorrente).setChequeEspecial((scanner.nextDouble()));
        contaCorrente.imprimir();

        System.out.println("\n--------------CONTA CORRENTE SAQUE --------------");
        System.out.printf("\nSeu saldo atual: " + contaCorrente.getSaldo());
        System.out.printf("\n\tInforme quanto deseja sacar: ");
        contaCorrente.sacar(scanner.nextDouble());
        contaCorrente.imprimir();

        System.out.printf("\n--------------CONTA CORRENTE DEPOSITO --------------");
        System.out.printf("\nSeu saldo atual: " + contaCorrente.getSaldo());
        System.out.printf("\n\tInforme quanto deseja depositar: ");
        contaCorrente.depositar(scanner.nextDouble());

        contaCorrente.imprimir();



    }
}
    



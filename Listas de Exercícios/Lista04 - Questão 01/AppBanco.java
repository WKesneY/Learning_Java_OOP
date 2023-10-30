import java.util.*;
public class AppBanco {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        ContaBancaria contaPoupanca = new ContaPoupanca(null, 0, 0);
        ContaBancaria contaCorrente = new ContaCorrente(null, 0, 0);

        System.out.println("BANCO UFC - CRIAR CONTAS");
        System.out.println("--------------CRIANDO UMA CONTA POUPANÇA.--------------");
        System.out.printf("\t\tInforme o número da conta: ");
        contaPoupanca.numeroConta = scanner.nextLine();
        System.out.printf("\t\tInforme o saldo inicial: ");
        contaPoupanca.saldo = scanner.nextDouble();
        System.out.print("\t\tInforme o rendimento em %: ");
        ((ContaPoupanca)contaPoupanca).setTaxaRendimento(scanner.nextDouble());

        contaPoupanca.imprimir();

        System.out.println("--------------CONTA POUPANCA SAQUE --------------");
        System.out.println("Seu saldo atual: " + contaPoupanca.getSaldo());
        System.out.println("\tInforme quanto deseja sacar: ");
        contaPoupanca.sacar(scanner.nextDouble());

        contaPoupanca.imprimir();

        System.out.println("--------------CONTA POUPANCA DEPOSITO --------------");
        System.out.println("Seu saldo atual: " + contaPoupanca.getSaldo());
        System.out.println("\tInforme quanto deseja depositar: ");
        contaPoupanca.depositar(scanner.nextDouble());

        contaPoupanca.imprimir();

        scanner.nextLine();
        System.out.println("--------------CRIANDO UMA CONTA CORRENTE.--------------");
        System.out.printf("\t\tInforme o número da conta: ");
        contaCorrente.numeroConta = scanner.nextLine();
        System.out.printf("\t\tInforme o saldo inicial: ");
        contaCorrente.saldo = scanner.nextDouble();
        System.out.print("\t\tInforme o limite de seu Cheque Especial: ");
        ((ContaCorrente)contaCorrente).setChequeEspecial(scanner.nextDouble());

        contaCorrente.imprimir();


    }
}
    



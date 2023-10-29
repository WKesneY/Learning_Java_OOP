import java.util.*;
public class AppBanco {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("BANCO UFC - CRIAR CONTAS");
        System.out.println("Informe quantas contas deseja criar: ");
        int n = scanner.nextInt();
        ContaBancaria[] vetorContas = new ContaBancaria[n];

        for(int i = 0; i < vetorContas.length; i++){
            System.out.println("Escolha o tipo da " + (i + 1) + "ª conta:");
            System.out.print("1) Conta poupaca\n2) Conta Corrente\nSua opção: ");
            int opcao = scanner.nextInt();

            while (opcao != 1 && opcao != 2) {
                System.out.println("Opção incorreta, por favor escolha o tipo da " + (i + 1) + "ª conta:");
                System.out.print("1) Conta poupaca\n2) Conta Corrente\nSua opção: ");
                opcao = scanner.nextInt();

                if(opcao == 1 || opcao == 2){
                    break;
                }
            }

            scanner.nextLine();
            System.out.println("Informe o número da conta: ");
            String numeroConta = scanner.nextLine();
            System.out.println("Informe o saldo inicial: ");
            double saldoInicial = scanner.nextDouble();
            scanner.nextLine();

            if(opcao == 1){
                System.out.println("Informe a taxa de rendimento em '%': ");
                double taxaRendimento = scanner.nextDouble();
                vetorContas[i] = new ContaPoupanca(numeroConta, saldoInicial, taxaRendimento);
            } else if(opcao == 2){
                System.out.println("Informe o limite: ");
                double limite = scanner.nextDouble();
                vetorContas[i] = new ContaCorrente(numeroConta, saldoInicial, limite);
            }
        }



    }
}
    



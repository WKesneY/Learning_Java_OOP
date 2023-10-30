public class ContaPoupanca extends ContaBancaria{
    protected double taxaRendimento; 

    public ContaPoupanca(String numeroConta, double saldo, double taxaRendimento){
            super(numeroConta, saldo);
            this.taxaRendimento = taxaRendimento;
        }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }
    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
    public double getSaldo(){
        return getSaldo() + (getSaldo() * (taxaRendimento / 100));
    }

    public void sacar(double valor){
        if ((getSaldo() - valor) >= 0){
            saldo -= valor;
        }else System.out.println("Valor inválido.");
    }


    public void imprimir(){
        System.out.println("\n-------INFORMAÇÕES DE SUA CONTA POUPANÇA-------");
        System.out.println("Numero de sua conta: " + numeroConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("Taxa de rendimento (em %): " + taxaRendimento);
        System.out.println();
    };
}

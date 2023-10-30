public class ContaPoupanca extends ContaBancaria{
    private double taxaRendimento; 

    public ContaPoupanca(String numeroConta, double saldo, double taxaRendimento){
            super(numeroConta, saldo);
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
}

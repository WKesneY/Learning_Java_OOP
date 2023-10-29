public class ContaPoupanca extends ContaBancaria{
    private double taxaRendimento; 

    public ContaPoupanca(String numeroConta, double saldo, double taxaRendimento){
            super(numeroConta, saldo);
            this.taxaRendimento = taxaRendimento;
        }

    public double getSaldo(){
        return getSaldo() + (getSaldo() * (taxaRendimento / 100));
    }

}

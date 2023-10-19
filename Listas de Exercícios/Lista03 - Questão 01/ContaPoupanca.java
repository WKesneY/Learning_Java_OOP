public class ContaPoupanca extends ContaBancaria{
    private double diaDeRendimento;
    
    //Contrutor
    public ContaPoupanca(String cliente, int numConta, double saldo){
        super(cliente, numConta, saldo);
        diaDeRendimento = 0.005; //declarei o rendimento com o valor ao lado

    }

    //Getters
    public double getDiaRendimento(){
        return diaDeRendimento;
    }
    public double calculaNovoSaldo(){
        setSaldo(getSaldo() + (getSaldo() * diaDeRendimento));
        return getSaldo();
    }


}

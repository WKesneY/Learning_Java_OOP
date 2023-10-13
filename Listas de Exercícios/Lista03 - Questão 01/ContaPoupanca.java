public class ContaPoupanca extends ContaBancaria{
    private int diaDeRendimento;
    
    //Contrutor
    public ContaPoupanca(String cliente, int numConta, double saldo, int diaDeRendimento){
        super(cliente, numConta, saldo);
        this.diaDeRendimento = diaDeRendimento;

    }

    //Getters
    public int getDiaRendimento(){
        return diaDeRendimento;
    }
    public double calculaNovoSaldo(double diaDeRendimento){
        setSaldo(getSaldo() * getDiaRendimento());
        return getSaldo();
    }


}

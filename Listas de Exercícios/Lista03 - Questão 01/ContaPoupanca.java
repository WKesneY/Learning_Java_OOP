public class ContaPoupanca extends ContaBancaria{
    private int diaDeRendimento;
    
    //Contrutor
    public ContaPoupanca(String cliente, int numConta, int diaDeRendimento){
        super(cliente, numConta);
        this.diaDeRendimento = diaDeRendimento;

    }
    
    public double calculaNovoSaldo(double diaDeRendimento){
        setSaldo(getSaldo() * diaDeRendimento);
        return getSaldo();
    }


}

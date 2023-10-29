public abstract class ContaBancaria{
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    //Getters and Setters:
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    public String getNumeroConta() {
        return numeroConta;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public abstract double getSal6do();

    //Métodos Concretos:
    public void depositar (double valor){
        saldo += valor;
    }

    public void sacar (double valor){
        if((saldo - valor) < 0){
            saldo -= valor;
        }
        System.out.println("Saldo insuficiente, informe um valor válido.");
    }


}
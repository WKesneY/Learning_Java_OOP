public abstract class ContaBancaria{
    private int contaBancaria;
    private double saldo;

    //Getters and Setters:
    public void setContaBancaria(int contaBancaria) {
        this.contaBancaria = contaBancaria;
    }
    public int getContaBancaria() {
        return contaBancaria;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }

    //Métodos Concretos:
    public void depositar (double valor){
        saldo += valor;
    }

    public void sacar (double valor){
        if(saldo - valor < 0){
            saldo -= valor;
        }
        System.out.println("Saldo insuficiente, informe um valor válido.");
    }
}
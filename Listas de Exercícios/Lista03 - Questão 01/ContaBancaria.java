public class ContaBancaria{
    protected String cliente;
    protected int numConta;
    protected double saldo;
    
    // Setters
    // public void setCliente(String cliente) {
    //     this.cliente = cliente;
    // }
    // public void setNumConta(int numConta) {
    //     this.numConta = numConta;
    // }
    // public void setSaldo(double saldo) {
    //     this.saldo = saldo;
    // }

    //Construtor
    public ContaBancaria(String cliente, int numConta){
        this.cliente = cliente;
        this.numConta = numConta;
        saldo = 0;
    }
    //Getters
    public String getCliente(){
        return cliente;
    }
    public int getNumConta(){
        return numConta;
    }
    public double getSaldo(){
        return saldo;
    }

    //Demais métodos
    public void sacar(double valor){
        if(saldo - valor >= 0){
            saldo -= valor;
        }else System.out.println("Saldo inválido para saque");
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void imprimirDados(){
        System.out.println("-----------DADOS BANCÁRIOS-----------");
        System.out.println("/Cliente: " + cliente);
        System.out.println("/Número da conta: " + numConta);
        System.out.println("/Saldo bancário: " + saldo);
    }

}
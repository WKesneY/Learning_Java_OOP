public class ContaCorrente extends ContaBancaria {
    public double chequeEspecial; //limite do chequeespecial

    public ContaCorrente(String numeroConta, double saldo, double chequeEspecial){
        super(numeroConta, saldo);
        this.chequeEspecial = chequeEspecial;    
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }
    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getSaldo(){
        return saldo + chequeEspecial; 
    }

    public void sacar(double valor){
        if ((valor <= getSaldo())){
            saldo -= valor;
        }else System.out.println("\nO valor informado ultrapassa o limite.");
    }

    public void imprimir(){
        System.out.println("\n-------INFORMAÇÕES DE SUA CONTA CORRENTE-------");
        System.out.println("Numero de sua conta: " + numeroConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("Seu limite (Cheque Especial): " + chequeEspecial);
        System.out.println();
    };
}

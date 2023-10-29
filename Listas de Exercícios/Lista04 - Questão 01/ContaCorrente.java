public class ContaCorrente extends ContaBancaria {
    public double chequeEspecial; //limite do chequeespecial

    public ContaCorrente(String numeroConta, double saldo, double chequeEspecial){
        super(numeroConta, saldo);
        this.chequeEspecial = chequeEspecial;    
    }

    public double getSaldo(){
        return getSaldo() + chequeEspecial; 
    }
}

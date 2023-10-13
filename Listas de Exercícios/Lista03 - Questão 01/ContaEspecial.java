public class ContaEspecial extends ContaBancaria {
    private double limite;
    
    //Contrutor
    ContaEspecial(String cliente, int getNumConta, double saldo){
        super(cliente, getNumConta, saldo);
        limite = -500.00; //delarei um valor específico p/ o limite permitido (R$500,00).
    }

    //Setters
    public void setLimite(int limite){
        this.limite = limite;
    }

    //Getters
    public double getLimite(){
        return limite;
    }

    //Métodos
    public void sacar(double valor){
        if(getSaldo() - valor >= limite){
            setSaldo(getSaldo() - valor);;
        }else System.out.println("VALOR DE SALDO INSULFICIENTE");
    }


}

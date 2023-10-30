public abstract class FormaPagamento{
    private double valorTotal;
    private int statusPagamento; //deveria ser usado dentro da função realizar pagamento?


    public abstract void realizarPagamento();

    public FormaPagamento(double valorTotal, int statusPagamento){
        this.valorTotal = valorTotal;
        this.statusPagamento = statusPagamento;

    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }


}
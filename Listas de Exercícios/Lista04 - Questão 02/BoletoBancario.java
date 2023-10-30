public class BoletoBancario extends FormaPagamento {
    String codigoBoleto;
    public BoletoBancario(double valorTotal, int statusPagamento, String codigoBoleto){
        super(valorTotal, statusPagamento);
        this.codigoBoleto = codigoBoleto;
    }

    public void realizarPagamento() {
        System.out.println("Pagamento com boleto bancário " + codigoBoleto + ", no valor de R$" + getValorTotal() + " realizado com sucesso!");
        System.out.println();
    }

    public String getCodigoBoleto() {
        return codigoBoleto;
    }
    public void setCodigoBoleto(String codigoBoleto) {
        this.codigoBoleto = codigoBoleto;
    }

    
}

public class CartaoCredito extends FormaPagamento {
    String numeroCartao;

    public CartaoCredito(double valorTotal, int statusPagamento, String numeroCartao){
        super(valorTotal, statusPagamento);
        this.numeroCartao = numeroCartao;
    }

    public void realizarPagamento() {
       System.out.println("Pagamento com cartão de crédito " + numeroCartao + ", no valor de R$" + getValorTotal() + " realizado com sucesso!");
       System.out.println();
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }



}

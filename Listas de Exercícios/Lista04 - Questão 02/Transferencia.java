public class Transferencia extends FormaPagamento {
    
    String bancoDestino;
    public Transferencia(double valorTotal, int statusPagamento, String bancoDestino){
        super(valorTotal, statusPagamento);
        this.bancoDestino = bancoDestino;
    }

    public void realizarPagamento() {
        System.out.println("Pagamento pro transferência bancária para o banco " + bancoDestino + ", no valor de R$" + getValorTotal() + " realizado com sucesso!");
    }
    
    public String getBancoDestino() {
        return bancoDestino;
    }
    public void setBancoDestino(String bancoDestino) {
        this.bancoDestino = bancoDestino;
    }
}

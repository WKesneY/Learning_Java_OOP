package financas;

public class Contabilidade {
    // Vendas vendas = new Vendas();
    // Como estão no mesmo package, não necessita da instancia.
    public double exibirReceitas(Vendas venda){
        return venda.vendasAnuais;
    }
    
}

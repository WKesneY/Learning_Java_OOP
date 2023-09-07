public class ContaLuz{
    String codBarras;
    double gastoKw;
    double valorConta;

    void setCodBarras(String codigo){
        this.codBarras = codigo;
    }
    void setGastoKw(double gasto){
        this.gastoKw = gasto;
    }
    void setvalorConta(double valor){
        this.valorConta = valor;
    }

    String getCodBarras(){
        return codBarras;
    }
    double getGastoKw(){
        return gastoKw;
    }
    double getValorConta(){
        return valorConta;
    }
    
}
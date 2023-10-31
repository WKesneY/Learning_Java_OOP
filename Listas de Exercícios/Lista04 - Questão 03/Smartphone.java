public class Smartphone extends DispositivoEletronico{
    String modelo;
    double precoBase;

    public Smartphone(String modelo, double precoBase){
        this.modelo = modelo;
        this.precoBase = precoBase;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecoBase() {
        return precoBase;
    }
    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }


    public double calcularPreco() {
        return precoBase - (precoBase * 0.05);
    }

    
}

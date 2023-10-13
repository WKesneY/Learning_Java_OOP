public class Personagens{
    protected String nome;
    protected int nivel;
    protected double xp;
    protected int saude;
    protected int forca;
    protected int inteligencia;
    protected int velocidade;

    //Construtor
    Personagens(String nome, int nivel, double xp, int saude, int forca, int inteligencia, int velocidade){
        this.nome = nome;
        this.nivel = nivel;
        this.xp = xp;
        this.saude = saude;
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.velocidade = velocidade;
    }

    //Getters e Setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setNivel(int nivel){
        this.nivel = nivel;
    }
    public int getNivel(){
        return nivel;
    }

    public void setNome(double xp){
        this.xp = xp;
    }
    public double getxp(){
        return xp;
    }

    public void setSaude(int saude){
        this.saude = saude;
    }
    public int getSaude(){
        return saude;
    }

    public void setForca(int forca){
        this.forca = forca;
    }
    public int getForca(){
        return forca;
    }

    public void setInteligencia(int inteligencia){
        this.inteligencia = inteligencia;
    }
    public int getInteligencia(){
        return inteligencia;
    }

    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }
    public int getVelocidade(){
        return velocidade;
    }
    //Demais Métodos


}
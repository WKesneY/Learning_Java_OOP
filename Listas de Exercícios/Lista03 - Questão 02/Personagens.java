public class Personagens{
    protected String nome;
    protected int nivel;
    protected double xp;

    //Construtor
    Personagens(String nome, int nivel, double xp){
        this.nome = nome;
        this.nivel = nivel;
        this.xp = xp;
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

    //Demais Métodos


}
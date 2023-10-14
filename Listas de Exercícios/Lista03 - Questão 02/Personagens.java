import java.security.ProtectionDomain;

public class Personagens{
    protected String nome;
    protected int nivel;
    protected int xp;
    protected int saude;
    protected int forca;
    protected int inteligencia;
    protected int velocidade;
    protected String tipoAtaque;
    protected String habilidade;

    //Construtor
    Personagens(String nome, int nivel, int xp, int saude, int forca, int inteligencia, int velocidade, String tipoAtaque, String habilidade){
        this.nome = nome;
        this.nivel = nivel;
        this.xp = xp;
        this.saude = saude;
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.velocidade = velocidade;
        this.tipoAtaque = tipoAtaque;
        this.habilidade = habilidade;
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

    public void setNome(int xp){
        this.xp = xp;
    }
    public int getxp(){
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

    public void imprimirPersonagem(){
        System.out.println("-----------PERSONAGEM-----------");
        System.out.println("/Nome: " + nome + " | Nível: " + nivel + " | Experiência: " + xp);
        System.out.println("ATRIBUTOS:");
        System.out.println("/Saúde: " + saude + " | Força: " + forca + " | Inteligência: " + inteligencia +
         " | Velocidade: " + velocidade);
        System.out.println("HABILIDADES:");
        System.out.println("/Tipo de Ataque: " + tipoAtaque + " | Habilidade: " + habilidade);
        System.out.println("\n");
    }
}
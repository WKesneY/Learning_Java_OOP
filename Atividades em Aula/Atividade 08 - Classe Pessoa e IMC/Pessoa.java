import java.util.*;

public class Pessoa{
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    //Métodos GETs
    public void getNome(String nome){
        this.nome = nome;
    }
    public void getIdade(int idade){
        this.idade = idade;
    }
    public void getAltura(double altura){
        this.altura = altura;
    }
    public void getPeso(double peso){
        this.peso = peso;
    }

    //Métodos SETs
    public String setNome(){
        return nome;
    }
    public int setIdade(){
        return idade;
    }
    public double setAltura(){
        return altura;
    }
    public double setPeso(){
        return peso;
    }

    //Demais métodos
    public double imc; 
    public double calcularIMC(Pessoa pessoa){
        imc =  peso / Math.pow(altura, 2);
        return imc;
    }

    public String toString(Pessoa pessoa){
        return "Nome: " + this.nome + ", Idade: " + this.idade + ", Altura: " + this.altura + ", Peso: " + this.peso + ".";
    }
}
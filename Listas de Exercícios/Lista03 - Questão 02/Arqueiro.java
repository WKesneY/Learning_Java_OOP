import java.util.*;
public class Arqueiro extends Personagens {
    Random random = new Random();

    Arqueiro(){
        super("Squirtle", 1, 0, 10, 5, 5, 10, "Distância", "Fuga veloz");
    }

    //As habilidades do arqueiro variam de acordo com sua velocidade
    public int habAtaque(){
        int ataque = random.nextInt(getInteligencia()/2);
        if(ataque % 2 == 0){
            return ataque * 2; //com chance de crítico
        }
        return ataque;
    }

    public boolean habFuga(){
        if((velocidade / 3) % 2 == 0){
            return true; //foge de um ataque
        }
        return false; //sem fuga
    }

}

import java.util.*;
public class Mago extends Personagens {

    Random random = new Random();
    Mago(){
        super("Bulbassaur", 1, 0, 12, 6, 10, 5, "Distãncia", "Curar");
    }

    public void habCurar(){
        int cura = random.nextInt((getInteligencia()/3));
        setSaude(getSaude() + cura);
    }

    //O ataque  a distância do mago será de acordo com sua inteligência 
    public int habAtaque(){
        int ataque = random.nextInt(getInteligencia()/2); //com chance de ter queimação
        if(ataque % 2 == 0){
            return ataque += 2;
        }
        return ataque;
    }



    
    
}

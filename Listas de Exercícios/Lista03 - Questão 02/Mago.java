import java.util.*;
public class Mago extends Personagens {

    Random random = new Random();
    Mago(){
        super("Bulbassaur", 1, 0, 12, 6, 10, 5);
    }

    public void habCurar(){
        int cura = random.nextInt((getInteligencia()/3));
        setSaude(getSaude() + cura);
    }



    
    
}

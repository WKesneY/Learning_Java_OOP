import java.util.*;
public class Guerreiro extends Personagens{

    Random random = new Random();

    Guerreiro(){
        super("Pikachu", 1, 0, 20, 10, 5, 5, "Corpo a corpo", "Chance de curar no ataque");}

    //Métodos

    //O ataque  corpo  corpo doguerreiro será de acordo com sua força 
    public int habAtaque(){
        int ataque = random.nextInt(getForca()/3); 
        if(ataque % 2 == 0){
            setSaude(getSaude() + 1); //com chance de se curar
            return ataque;
        }
        return ataque;
    }
}






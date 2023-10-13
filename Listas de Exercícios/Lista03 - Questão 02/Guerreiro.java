import java.util.*;
public class Guerreiro extends Personagens{

    Random random = new Random();

    Guerreiro(){
        super("Pikachu", 1, 0, 20, 10, 5, 5);}

    //Métodos

    //O ataque  corpo  corpo doguerreiro será de acordo com sua força 
    public int habAtaque(){
        int ataque = random.nextInt(getForca()/2); //com chance de ter queimação
        if(ataque % 2 == 0){
            return ataque += 2;
        }
        return ataque;
    }
}






import java.util.*;

public class Tabuada {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("-------------------- TABUADA --------------------");
        System.out.print("Informe um número:\t");
        num = scanner.nextInt();

        int aux = 1;
        while(aux <= 10){
            System.out.println("[" + num + " x " + aux + " = " + num*aux + "]");
            System.out.println();

            aux++;
        }

    
    }
    
}

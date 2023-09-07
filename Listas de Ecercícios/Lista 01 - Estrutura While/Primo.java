import java.util.*;

public class Primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("---------------- CHECAR SE É PRIMO ----------------");

        while(true){
        int aux = 0;
        System.out.print("\nInforme um número:");
        num = scanner.nextInt();
        
        for(int i = 2; i <= num / 2; i++){
            if(num % i == 0){
                aux++;
                break;
            }
        }

        if(aux == 0){
            System.out.println("-> NUMERO PRIMO <-");
            break;
        }else System.out.println("-> NUMERO NAO PRIMO <-");

        }
                
        scanner.close();
    }
}

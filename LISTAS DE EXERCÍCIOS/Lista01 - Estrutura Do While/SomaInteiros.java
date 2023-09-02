import java.util.*;

public class SomaInteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------- SOMA DE INTEIROS -----------");
        System.out.print("Infome um número:\t");
        int num = scanner.nextInt();
        scanner.close();
        int aux = 1, soma = 0;

        do{
            soma += aux;
            aux++;
        }while(aux <= num);

        System.out.println("\n-> [SOMA TOTAL = " + soma + "] <-");

    }
    
}

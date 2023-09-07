import java.util.*;
public class Quadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------- CHECAR QUADRADO PERFEITO -----------");
        do{
            System.out.print("\nInforme um número: ");
            int x = scanner.nextInt();

            int raizX = (int) Math.sqrt(x);

            if(raizX * raizX == x){
                System.out.println("\n-> O NUMERO " + x + " É UM QUADRADO PERFEITO] <-");
                break;
            }else{
                System.out.println("\n-> [O NUMERO " + x + " NÃO É UM QUADRADO PERFEITO] <-");
            }
        }while(true);
    }
    
}

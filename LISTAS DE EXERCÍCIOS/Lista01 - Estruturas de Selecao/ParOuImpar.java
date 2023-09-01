import java.util.*;

public class ParOuImpar {
    public static void main(String[] args){
        int num = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------- PAR OU IMPAR? ---------------");
        System.out.printf("\n\nINFORME O VALOR: ");
        num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.println("-> NUMERO PAR <-");
        }else System.out.println(("-> NUMERO IMPAR <-"));

    }
    
}

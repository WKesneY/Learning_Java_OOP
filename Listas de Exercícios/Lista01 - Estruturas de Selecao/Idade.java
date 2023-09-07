import java.util.*;


public class Idade{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int idade;  //Idade a ser recebida pelo usuário.

        System.out.println("----------------------CHECAR IDADE----------------------");

        do{
        System.out.printf("\nINFORME SUA IDADE: ");
        idade = scanner.nextInt();

            if(idade >= 18){
                System.out.printf("-> [MAIOR DE IDADE!] <-");
                break;
            }else if(idade >= 0 && idade < 18){
                System.out.println("-> [MENOR DE IDADE!] <-");
                break;
            }else System.out.println("-> [IDADE INVÁLIDA!] <-");

        }while(idade < 0);

    }
}

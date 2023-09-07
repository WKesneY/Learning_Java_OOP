import java.util.*;

public class Senha{
    public static void main(String[] args){
        String senha = "emerson123";
        Scanner scanner = new Scanner(System.in);
        System.out.print("---------------------- CHECAR SENHA ----------------------");

        do{
            System.out.printf("\nInforme uma senha: ");
            String senhaChecar = scanner.nextLine();

            if(!(senha.equals(senhaChecar))){
                System.out.println("-> SENHA INCORRETA!! <-");
                continue;
            }else{
                System.out.println("-> SENHA CORRETA | ACESSO LIBERADO <-");
                break;
            }
        }while(true);
    }
}
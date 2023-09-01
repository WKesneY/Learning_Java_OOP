import java.util.*; 

public class MaiorEMenor {

    public static void main(String[] args){
        int num1;
        int num2;

        Scanner scanner = new Scanner(System.in);

        System.out.printf("INFORME O PRIMEIRO VALOR: ");
        num1 = scanner.nextInt();
        System.out.printf("INFORME O SEGUNDO VALOR: ");
        num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.println("-> PRIMEIRO NUMERO E MAIOR! <-");
        }else if(num1 < num2){
            System.out.println("-> SEGUNDO NUMERO E MAIOR! <-");
        }else System.out.println("-> AMBOS NUMEROS SAO IGUAIS <-");


    }
    
}

import java.util.*;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vet[] = new int[10];
        int recebeNum;

        System.out.println("--------------INFORME DEZ VALORES--------------");

        for(int i = 0; i < vet.length; i++){
            System.out.printf("\nINFORME UM NUMERO: ");
            recebeNum = scanner.nextInt();

            vet[i] = recebeNum;
        }

        for(int i = 0; i < vet.length; i++){
            System.out.printf("[%d] ", vet[i]);
        }

        int soma = 0;
        for(int i = 0; i < vet.length; soma+=vet[i], i++);

        double media = (double)soma /  (double)vet.length;
        System.out.println("\n\n-> [A MEDIA É: " + media + "] <-");

    }
    
}

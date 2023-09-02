import java.util.*;
public class Soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("INFORME UM NUMERO:\t");
        num = scanner.nextInt();
        int soma = num;

        while(num != 0){
            System.out.print("INFORME UM NUMERO:\t");
            num = scanner.nextInt();
            soma += num;
        }

        System.out.println("\nVALOR DA SOMA DOS VALORES INFORMADOS:\t[" + soma + "]");

    }
    
}

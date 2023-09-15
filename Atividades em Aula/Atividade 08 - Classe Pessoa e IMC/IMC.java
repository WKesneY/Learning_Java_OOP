import java.util.*;
public class IMC {
    public static void main(String[] args) {
        Pessoa pessoaUm = new Pessoa();
        Scanner scanner = new Scanner(System.in);

        //Cadastrando pessoa:
        System.out.println("----------------CADASTRO BOLSA FAMILIA----------------");
        System.out.printf("\nInforme seu nome: ");
        pessoaUm.getNome(scanner.nextLine());
        System.out.printf("\nInforme sua idade: ");
        pessoaUm.getIdade(scanner.nextInt());
        System.out.printf("\nInforme sua altura: ");
        pessoaUm.getAltura(scanner.nextDouble());
        System.out.println("\nInforme seu peso: ");
        pessoaUm.getPeso(scanner.nextDouble());

        //Pessoa cadastrada
        
        System.out.printf(" %.2f",pessoaUm.calcularIMC(pessoaUm));
        pessoaUm.toString(pessoaUm);


    }
    
}

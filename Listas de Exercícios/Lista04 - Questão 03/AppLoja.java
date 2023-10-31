import java.util.*;
public class AppLoja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        

        System.out.print("CADASTRO DE DISPOSITIVOS");
        System.out.println("\nInforme quantos dispositivos deseja cadastrar: ");
        int numDispositivos = scanner.nextInt();
        DispositivoEletronico[] dispositivos = new DispositivoEletronico[numDispositivos];

        for(int i = 0; i < numDispositivos; i++){

        System.out.print("\nOPÇÕES DE DISPOSITIVOS");
        System.out.println("\n1) Smartphoe\n2)Tablet\n3)Laptop");
        System.out.print("Informe o dispositivo a qual deseja cadastrar: ");
        int opcao = scanner.nextInt();
        
        scanner.nextLine();
            while (opcao != 1 && opcao != 2 && opcao != 3) {
            System.out.print("\n\nPor gentileza, informe uma opção válida.\nDispositivos a serem cadastrados: ");
            System.out.print("\n1) Smartphoe\n2)Tablet\n3)Laptop");
            System.out.print("\nInforme o dispositivo a qual deseja cadastrar: ");
            opcao = scanner.nextInt();
            
            if (opcao == 1 || opcao == 2 || opcao == 3) {
                break;
            }
        }

        scanner.nextLine();
        switch (opcao) {
            case 1:
                System.out.print("\nInforme o modelo do Smartphone: ");
                String modelo = scanner.nextLine();
                System.out.print("\nInforme o valor do dispositivo: ");
                double valor = scanner.nextDouble();
                
                dispositivos[i] = new Smartphone(modelo, valor);
                break;
        
            case 2:
                
                System.out.print("\nInforme o modelo do Tablet: ");
                modelo = scanner.nextLine();
                System.out.print("\nInforme o valor do dispositivo: ");
                valor = scanner.nextDouble();
                
                dispositivos[i] = new Tablet(modelo, valor);
                break;

            case 3:

                System.out.print("\nInforme o modelo do Laptop: ");
                modelo = scanner.nextLine();
                System.out.print("\nInforme o valor do dispositivo: ");
                valor = scanner.nextDouble();
                
                dispositivos[i] = new Laptop(modelo, valor);
                break;
        }
        }

        System.out.println("\nPreços calculados com desconto:");

        for (int i = 0; i < numDispositivos; i++) {
            double precoComDesconto = dispositivos[i].calcularPreco();
            System.out.println("Dispositivo " + (i + 1) + ": R$" + precoComDesconto);
        }
        

        
    }
}

import java.util.Scanner;

public class MetodosCliente {

    Cliente vetorCliente[] = new Cliente[2];

    void printCliente(Cliente vet[]){
        System.out.printf("------------------CLIENTES CADASTRADOS--------------------");
        for(int i = 0; i < vet.length; i++){

            System.out.println("\nNome:" + vet[i].getNome());
            System.out.println("CPF:" + vet[i].getCpf());
            System.out.println("Endereço: " + vet[i].getEndereco());

        }

    }
}

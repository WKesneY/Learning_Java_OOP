import java.util.*;
public class Contas {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ContaPoupanca clientePoupanca = new ContaPoupanca("Everton", 515451, 1500.00, 444 );
    ContaEspecial clieContaEspecial = new ContaEspecial("Kesney", 55485, 5000.00);

    clientePoupanca.imprimirDados();
    clieContaEspecial.imprimirDados();

    clientePoupanca.sacar(1499);
    clientePoupanca.imprimirDados();

    }

}

import java.util.*;
public class AppColecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho de sua coleção: ");
        int tamanhoArray = scanner.nextInt();

        Livro[] colecao = new Livro[tamanhoArray];

        for(int i = 0; i < tamanhoArray; i++){
            scanner.next();
            System.out.println("Seu ítem é um Ebook ou Livro?");
            System.out.println("1 para EBook.\n2 para AudioLivro");
            int resposta = scanner.nextInt();

            while(resposta != 1 || resposta != 2){

                System.out.println("Informe novamente: ");
                System.out.println("1 para e-Book.\n2 para AudioLivro");
                resposta = scanner.nextInt();

                if(resposta == 1 || resposta == 2){
                    break;
                }
            }
            
            if(resposta == 1){
                scanner.next();
                System.out.println("Informe os dados de seu e-Book: ");
                System.out.print("\nTitulo: ");
                String titulo = scanner.nextLine();
                System.out.print("\nAutor: ");
                String autor = scanner.nextLine();
                System.out.print("\nValor: ");
                double preco = scanner.nextDouble();
                System.out.print("\nTamanho do arquivo: ");
                double tamanhoArquivo = scanner.nextDouble();

                colecao[i] = new EBook(titulo, autor, preco, tamanhoArquivo);
            }else{
                scanner.next();
                System.out.println("Informe os dados de seu AudioLivro: ");
                System.out.print("\nTitulo: ");
                String titulo = scanner.nextLine();
                System.out.print("\nAutor: ");
                String autor = scanner.nextLine();
                System.out.print("\nValor: ");
                double preco = scanner.nextDouble();
                System.out.print("\nTempo de duração em minutos: ");
                int tempoDuracao = scanner.nextInt();

                colecao[i] = new AudioLivro(titulo, autor, preco, tempoDuracao);

            }
 
        }
    }
    
    
}

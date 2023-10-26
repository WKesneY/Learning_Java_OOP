import java.util.*;

public class MatrizQuadradosPerfeitos{
    private int contadorGlobal = 10;
    
    //para retonar matriz, lembrar de inicializar o método com [][].
    public int[][] inicializarMatriz() {
        int linha = 3;
        int coluna = 4;
        double raiz;
        int matriz[][] = new int[linha][coluna];
    
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                while (true) {
                    contadorGlobal++;
                    raiz = Math.sqrt(contadorGlobal);
                    if (raiz == (int)raiz) {//checar se a raiz é inteira usando cast
                        matriz[i][j] = contadorGlobal;
                        break;
                    }
                }
            }
        }
    
        return matriz;
    }

    public void imprimirMatriz(int matriz[][]) {
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print("[" + elemento + "] ");
            }
            System.out.println(); //pular linha depois de ler as linhas
        }
    }

    public static void main(String[] args) {
        MatrizQuadradosPerfeitos matrizTeste = new MatrizQuadradosPerfeitos();
        //lembrar de criar uma matriz para ser preenchida pelo método inicializarMatriz
        int matriz[][] = matrizTeste.inicializarMatriz();
        matrizTeste.imprimirMatriz(matriz);
    }
}
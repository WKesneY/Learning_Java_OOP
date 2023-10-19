public class CifraVigenere{
    private char[][] matrizVigenere;
    private int linhas = 25;
    private int colunas = 25;

    public char[][] criarTabVigenere(){
        matrizVigenere = new char[linhas][colunas];
        char aux = 'A';

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                matrizVigenere[i][j] = aux;
                aux++;
                if(aux > 'Z'){
                    aux = 'A';
                }
                }
            }
        return matrizVigenere;
        }


    CifraVigenere(){
        criarTabVigenere();
    }

    public void imprimirTabVigenere(){
        for (char[] linha : matrizVigenere) {
            for (char elemento : linha) {
                System.out.print(" [" + elemento + "] ");
            }
            System.out.println(); // Quebra de linha entre as linhas da matriz
        }
    }

}
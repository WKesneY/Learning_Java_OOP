public class Matriz{
    public static void main(String[] args) {
        int[][] matriz = new int[2][3];
        int x = 0;

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                matriz[i][j] = ++x;
                
            }
        }

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }
        

        
    }
}
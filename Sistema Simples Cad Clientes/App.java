public class App {
    public static void main(String[] args){

        int d = 2;
        Cliente[] vetCliente = new Cliente[d];

        for(int i = 0; i < d; i++){
            vetCliente[i] = new Cliente();
        }
        
        vetCliente[0].setNome("TESTE UM");
        vetCliente[0].setCpf("TESTE UM");
        vetCliente[0].setEndereco("TESTE UM");

        vetCliente[1].setNome("TESTE 123");
        vetCliente[1].setCpf("TESTE DOIS");
        vetCliente[1].setEndereco("TESTE DOIS"); 

        MetodosCliente metCliente = new MetodosCliente();

        metCliente.printCliente(vetCliente);

    }
    
}

public class App {
    public static void main(String[] args){
 
        Cliente[] vetCliente = new Cliente[1];
        
        vetCliente[0].setNome("aaaaaaaa");
        vetCliente[0].setCpf("aaaaaaaa");
        vetCliente[0].setEndereco("aaaaaaaa");

        vetCliente[1].setNome("bbbbbbbbb");
        vetCliente[1].setCpf("bbbbbbbbb");
        vetCliente[1].setEndereco("bbbbbbbbb");

        MetodosCliente metCliente = new MetodosCliente();

        MetodosCliente.printCliente(vetCliente);

    }
    
}

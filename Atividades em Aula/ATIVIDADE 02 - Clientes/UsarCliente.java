class UsarCliente{

    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        cliente1.setNome("Wildney Kesney");
        cliente1.setCPF("0785115302");
        cliente1.setEndereco("Rua Dr Jose Bezerra de Melo");
    
        cliente2.setNome("kesney");
        cliente2.setCPF("1256");
        cliente2.setEndereco("teste");

        System.out.println("-------DADOS CADASTRAIS, CLIENTE 1---------------");
        cliente1.printCadastro();

        System.out.println("-------DADOS CADASTRAIS, CLIENTE 2---------------");
        cliente2.printCadastro();
    
    }
    
}

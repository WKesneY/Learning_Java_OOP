class UsarVeiculo{
    public static void main(String[] args) {
        Veiculo auto1 = new Veiculo();
        Veiculo auto2 = new Veiculo(); 

        int autonomiaA;

        auto1.nome = "teste";
        auto1.numPassageiro = 55;
        auto1.cor = "VERMELHO";
        auto1.consumo = 22;

        auto2.nome = "Wolks";
        auto2.numPassageiro = 66;
        auto2.cor = "Azul";
        autonomiaA = auto1.consumo * auto1.numPassageiro;

        System.out.printf("Automovel 1: capacidade %d pessoas. \n Autonomia: %d km", auto1.numPassageiro, autonomiaA);

        
    }
}